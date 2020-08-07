uniform sampler2D RT;
uniform sampler2D NormalMap;
varying vec2 oUv0;

void main()
{
    //vec4 normal = 2.0 * (texture2D(NormalMap, oUv0 * 2.5) - 0.5);
    vec4 c = texture2D(RT, oUv0 /*+ normal.xy * 0.05*/);
    gl_FragColor = c * vec4(1.0, 0.0, 0.0, 1.0);
}
