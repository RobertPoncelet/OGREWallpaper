uniform mat4 worldViewProj;
uniform float time;

attribute vec4 vertex;
attribute vec4 uv0;

varying vec4 modelPos;
varying vec4 texCoord;

#define SNAP_FACTOR 8.0

void main(void)
{
    modelPos = vertex;
    vec4 P = worldViewProj * vertex;
    //P = floor(P * SNAP_FACTOR) / SNAP_FACTOR;

    float alpha = (sin(time*2.0) * 0.5) + 0.5;

    vec4 sus = vec4(0.0);
    sus.xy = P.xy / P.w;
    //sus.xy = sus.y > 0.5 ? sus.xy * vec2(0.3, 1.0) : sus.xy;
    sus.z = 1.0;//P.z;
    sus.w = 1.0;

	gl_Position = sus;//mix(P, sus, alpha);

    //gl_Position = P;
    //gl_Position.w = mix(P.w, 2.0, alpha);

    texCoord = uv0;
    texCoord.w = gl_Position.w;
}
