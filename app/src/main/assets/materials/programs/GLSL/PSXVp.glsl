uniform mat4 worldViewProj;
uniform float time;

attribute vec4 vertex;
attribute vec4 uv0;

varying vec4 modelPos;
varying vec4 texCoord;

#define SNAP_FACTOR 128.0

void main(void)
{
    modelPos = vertex;
    vec4 P = worldViewProj * vertex;

    vec4 noPersp = vec4(P.xyz / P.w, 1.0);

    noPersp.xy = floor(noPersp.xy * SNAP_FACTOR) / SNAP_FACTOR;

	gl_Position = noPersp;

    texCoord = uv0;
    texCoord.w = gl_Position.w;
}
