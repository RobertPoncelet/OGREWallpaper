uniform sampler2D RT;
uniform sampler2D NormalMap;
uniform vec4 cViewportSize; // auto param width/height/invWidth/invHeight
varying vec2 oUv0;

/*
    CRT Shader by EasyMode
    License: GPL

    A flat CRT shader ideally for 1080p or higher displays.

    Recommended Settings:

    Video
    - Aspect Ratio: 4:3
    - Integer Scale: Off

    Shader
    - Filter: Nearest
    - Scale: Don't Care

    Example RGB Mask Parameter Settings:

    Aperture Grille (Default)
    - Dot Width: 1
    - Dot Height: 1
    - Stagger: 0

    Lottes' Shadow Mask
    - Dot Width: 2
    - Dot Height: 1
    - Stagger: 3
*/

/*#pragma parameter SHARPNESS_H "Sharpness Horizontal" 0.5 0.0 1.0 0.05
#pragma parameter SHARPNESS_V "Sharpness Vertical" 1.0 0.0 1.0 0.05
#pragma parameter MASK_STRENGTH "Mask Strength" 0.3 0.0 1.0 0.01
#pragma parameter MASK_DOT_WIDTH "Mask Dot Width" 1.0 1.0 100.0 1.0
#pragma parameter MASK_DOT_HEIGHT "Mask Dot Height" 1.0 1.0 100.0 1.0
#pragma parameter MASK_STAGGER "Mask Stagger" 0.0 0.0 100.0 1.0
#pragma parameter MASK_SIZE "Mask Size" 1.0 1.0 100.0 1.0
#pragma parameter SCANLINE_STRENGTH "Scanline Strength" 1.0 0.0 1.0 0.05
#pragma parameter SCANLINE_BEAM_WIDTH_MIN "Scanline Beam Width Min." 1.5 0.5 5.0 0.5
#pragma parameter SCANLINE_BEAM_WIDTH_MAX "Scanline Beam Width Max." 1.5 0.5 5.0 0.5
#pragma parameter SCANLINE_BRIGHT_MIN "Scanline Brightness Min." 0.35 0.0 1.0 0.05
#pragma parameter SCANLINE_BRIGHT_MAX "Scanline Brightness Max." 0.65 0.0 1.0 0.05
#pragma parameter SCANLINE_CUTOFF "Scanline Cutoff" 400.0 1.0 1000.0 1.0
#pragma parameter GAMMA_INPUT "Gamma Input" 2.0 0.1 5.0 0.1
#pragma parameter GAMMA_OUTPUT "Gamma Output" 1.8 0.1 5.0 0.1
#pragma parameter BRIGHT_BOOST "Brightness Boost" 1.2 1.0 2.0 0.01
#pragma parameter DILATION "Dilation" 1.0 0.0 1.0 1.0*/

#ifdef PARAMETER_UNIFORM
uniform float BRIGHT_BOOST;
uniform float DILATION;
uniform float GAMMA_INPUT;
uniform float GAMMA_OUTPUT;
uniform float MASK_SIZE;
uniform float MASK_STAGGER;
uniform float MASK_STRENGTH;
uniform float MASK_DOT_HEIGHT;
uniform float MASK_DOT_WIDTH;
uniform float SCANLINE_CUTOFF;
uniform float SCANLINE_BEAM_WIDTH_MAX;
uniform float SCANLINE_BEAM_WIDTH_MIN;
uniform float SCANLINE_BRIGHT_MAX;
uniform float SCANLINE_BRIGHT_MIN;
uniform float SCANLINE_STRENGTH;
uniform float SHARPNESS_H;
uniform float SHARPNESS_V;
#else
#define BRIGHT_BOOST 1.3
#define DILATION 1.0
#define GAMMA_INPUT 2.0
#define GAMMA_OUTPUT 1.8
#define MASK_SIZE 1.0
#define MASK_STAGGER 3.0
#define MASK_STRENGTH 0.3
#define MASK_DOT_HEIGHT 1.0
#define MASK_DOT_WIDTH 2.0
#define SCANLINE_BEAM_WIDTH_MAX 1.5
#define SCANLINE_BEAM_WIDTH_MIN 1.5
#define SCANLINE_BRIGHT_MAX 0.65
#define SCANLINE_BRIGHT_MIN 0.35
#define SCANLINE_STRENGTH 0.8
#define SHARPNESS_H 0.5
#define SHARPNESS_V 1.0
#endif

/*#include "../../compat_includes.inc"
uniform COMPAT_Texture2D(decal) : TEXUNIT0;
uniform mat4 modelViewProj;*/

#define FIX(c) max(abs(c), 1e-5)
#define PI 3.141592653589
//#define TEX2D(c) dilate(COMPAT_SamplePoint(tex, c))
//#define TEX2D(c) dilate(texelFetch(tex, c))
#define TEX2D(c) dilate(texture2D(tex, c))
//#define mod(x,y) (x - y * trunc(x/y))

// Set to 0 to use linear filter and gain speed
// TODO: see if this works
#define ENABLE_LANCZOS 0

/*struct out_vertex
{
    vec4 position : COMPAT_POS;
    vec2 texCoord : TEXCOORD0;
    #ifndef HLSL_4
    vec4 Color    : COLOR;
    #endif
};

out_vertex main_vertex(COMPAT_IN_VERTEX)
{
    out_vertex OUT;
    #ifdef HLSL_4
    vec4 position = VIN.position;
    vec2 texCoord = VIN.texCoord;
    #else
    OUT.Color = color;
    #endif
    OUT.position = mul(modelViewProj, position);
    OUT.texCoord = texCoord;
    return OUT;
}*/

vec4 dilate(vec4 col)
{
    vec4 x = mix(vec4(1.0), col, DILATION);

    return col * x;
}

float curve_distance(float x, float sharp)
{
    /*
        apply half-circle s-curve to distance for sharper (more pixelated) interpolation
        single line formula for Graph Toy:
        0.5 - sqrt(0.25 - (x - step(0.5, x)) * (x - step(0.5, x))) * sign(0.5 - x)
    */

    float x_step = step(0.5, x);
    float curve = 0.5 - sqrt(0.25 - (x - x_step) * (x - x_step)) * sign(0.5 - x);

    return mix(x, curve, sharp);
}

mat4 get_color_matrix(sampler2D tex, vec2 co, vec2 dx)
{
    //return mat4(TEX2D(co - dx), TEX2D(co), TEX2D(co + dx), TEX2D(co + 2.0 * dx));
    // TODO: what is COMPAT_SamplePoint exactly?
    return mat4(dilate(texture2D(tex, co - dx)), dilate(texture2D(tex, co)), dilate(texture2D(tex, co + dx)), dilate(texture2D(tex, co + 2.0 * dx)));
    //return mat4(dilate(texelFetch(tex, co - dx)), dilate(texelFetch(tex, co)), dilate(texelFetch(tex, co + dx)), dilate(texelFetch(tex, co + 2.0 * dx)));
}

vec3 filter_lanczos(vec4 coeffs, mat4 color_matrix)
{
    //vec4 col = mul(coeffs, color_matrix);
    vec4 col = coeffs * color_matrix;
    // TODO: since this is converted from Cg, does we need to transpose the matrix indices?
    vec4 sample_min = min(color_matrix[1], color_matrix[2]);
    vec4 sample_max = max(color_matrix[1], color_matrix[2]);

    col = clamp(col, sample_min, sample_max);

    return col.rgb;
}

vec4 crt_easymode(vec2 texture_size, vec2 video_size, vec2 output_size, vec2 coords, sampler2D tex)
{
    vec2 dx = vec2(1.0 / texture_size.x, 0.0);
    vec2 dy = vec2(0.0, 1.0 / texture_size.y);
    vec2 pix_co = coords * texture_size - vec2(0.5, 0.5);
    vec2 tex_co = (floor(pix_co) + vec2(0.5, 0.5)) / texture_size;
    vec2 dist = fract(pix_co);
    float curve_x;
    vec3 col, col2;

#if ENABLE_LANCZOS
    curve_x = curve_distance(dist.x, SHARPNESS_H * SHARPNESS_H);

    vec4 coeffs = PI * vec4(1.0 + curve_x, curve_x, 1.0 - curve_x, 2.0 - curve_x);

    //coeffs = FIX(coeffs);
    coeffs = max(abs(coeffs), 1e-5);
    coeffs = 2.0 * sin(coeffs) * sin(coeffs / 2.0) / (coeffs * coeffs);
    coeffs /= dot(coeffs, vec4(1.0));

    col = filter_lanczos(coeffs, get_color_matrix(tex, tex_co, dx));
    col2 = filter_lanczos(coeffs, get_color_matrix(tex, tex_co + dy, dx));
#else
    curve_x = curve_distance(dist.x, SHARPNESS_H);

    col = mix(TEX2D(tex_co).rgb, TEX2D(tex_co + dx).rgb, curve_x);
    col2 = mix(TEX2D(tex_co + dy).rgb, TEX2D(tex_co + dx + dy).rgb, curve_x);
#endif

    col = mix(col, col2, curve_distance(dist.y, SHARPNESS_V));
    col = pow(col, vec3(GAMMA_INPUT / (DILATION + 1.0)));

    float luma = dot(vec3(0.2126, 0.7152, 0.0722), col);
    float bright = (max(col.r, max(col.g, col.b)) + luma) / 2.0;
    float scan_bright = clamp(bright, SCANLINE_BRIGHT_MIN, SCANLINE_BRIGHT_MAX);
    float scan_beam = clamp(bright * SCANLINE_BEAM_WIDTH_MAX, SCANLINE_BEAM_WIDTH_MIN, SCANLINE_BEAM_WIDTH_MAX);
    float scan_weight = 1.0 - pow(cos(coords.y * 2.0 * PI * texture_size.y) * 0.5 + 0.5, scan_beam) * SCANLINE_STRENGTH;

    float mask = 1.0 - MASK_STRENGTH;
    vec2 mod_fac = floor((abs(coords) * video_size) / vec2(MASK_SIZE, MASK_DOT_HEIGHT * MASK_SIZE)); //floor(coords * output_size * texture_size / (video_size * vec2(MASK_SIZE, MASK_DOT_HEIGHT * MASK_SIZE)));
    int dot_no = int(mod((mod_fac.x + mod(mod_fac.y, 2.0) * MASK_STAGGER) / MASK_DOT_WIDTH, 3.0));
    vec3 mask_weight;

    if (dot_no == 0) mask_weight = vec3(1.0, mask, mask);
    else if (dot_no == 1) mask_weight = vec3(mask, 1.0, mask);
    else mask_weight = vec3(mask, mask, 1.0);

    col2 = col.rgb;
    col *= vec3(scan_weight);
    col = mix(col, col2, scan_bright);
    col *= mask_weight;
    col = pow(col, vec3(1.0 / GAMMA_OUTPUT));

    return vec4(col * BRIGHT_BOOST, 1.0);
}

/*vec4 main_fragment(COMPAT_IN_FRAGMENT) : COMPAT_Output
{
    return crt_easymode(COMPAT_texture_size, COMPAT_video_size, COMPAT_output_size, VOUT.texCoord, decal);
};*/

void main()
{
    //vec4 normal = 2.0 * (texture2D(NormalMap, oUv0 * 2.5) - 0.5);
    //gl_FragColor = texture2D(RT, oUv0 + normal.xy * 0.05);
    vec2 size = vec2(1080.0, 2220.0); // TODO: fix this hack
    //gl_FragColor = crt_easymode(cViewportSize.xy, cViewportSize.xy, cViewportSize.xy, oUv0, RT);
    gl_FragColor = crt_easymode(size/8.0, size/5.0, size, oUv0, RT);
}