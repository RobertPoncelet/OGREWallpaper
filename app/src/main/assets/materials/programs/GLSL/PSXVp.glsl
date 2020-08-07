uniform mat4 worldViewProj;
uniform vec4 cViewportSize; // auto param width/height/invWidth/invHeight

attribute vec4 vertex;
attribute vec4 uv0;

varying vec4 modelPos;
varying vec4 texCoord;

#define SNAP_FACTOR 1.5

void main(void)
{
    modelPos = vertex;
    vec4 P = worldViewProj * vertex;

    vec4 noPersp = vec4(P.xyz / P.w, 1.0);

    vec2 factor = cViewportSize.zw * SNAP_FACTOR;
    noPersp.xy = floor(noPersp.xy / factor) * factor;

	gl_Position = noPersp;

    texCoord = uv0;
    texCoord.w = gl_Position.w;
}
