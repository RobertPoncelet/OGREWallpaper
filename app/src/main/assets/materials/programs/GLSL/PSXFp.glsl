uniform sampler2D diffuseMap;

varying vec4 modelPos;
varying vec4 texCoord;

#define DEBUG 0

void main(void)
{
#if DEBUG
    float thing = texCoord.w * 0.1;
    float thing2 = -texCoord.w * 0.1;
    //gl_FragColor = vec4(thing, thing2, 0.0, 1.0);
    vec4 chequer = vec4(texture2D(diffuseMap, texCoord.xy * 4.0).r);
    gl_FragColor = vec4(modelPos.x, -modelPos.z, texCoord.w - 1.0, 1.0) * chequer;
#else
    gl_FragColor = texture2D(diffuseMap, texCoord.xy);
#endif
}
