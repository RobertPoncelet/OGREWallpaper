/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ShadowCaster {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ShadowCaster(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ShadowCaster obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ShadowCaster(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean getCastShadows() {
    return OgreJNI.ShadowCaster_getCastShadows(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__EdgeData getEdgeList() {
    long cPtr = OgreJNI.ShadowCaster_getEdgeList(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__EdgeData(cPtr, false);
  }

  public boolean hasEdgeList() {
    return OgreJNI.ShadowCaster_hasEdgeList(swigCPtr, this);
  }

  public AxisAlignedBox getWorldBoundingBox(boolean derive) {
    return new AxisAlignedBox(OgreJNI.ShadowCaster_getWorldBoundingBox__SWIG_0(swigCPtr, this, derive), false);
  }

  public AxisAlignedBox getWorldBoundingBox() {
    return new AxisAlignedBox(OgreJNI.ShadowCaster_getWorldBoundingBox__SWIG_1(swigCPtr, this), false);
  }

  public AxisAlignedBox getLightCapBounds() {
    return new AxisAlignedBox(OgreJNI.ShadowCaster_getLightCapBounds(swigCPtr, this), false);
  }

  public AxisAlignedBox getDarkCapBounds(Light light, float dirLightExtrusionDist) {
    return new AxisAlignedBox(OgreJNI.ShadowCaster_getDarkCapBounds(swigCPtr, this, Light.getCPtr(light), light, dirLightExtrusionDist), false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ShadowRenderable_p_t getShadowVolumeRenderableList(ShadowTechnique shadowTechnique, Light light, HardwareIndexBufferPtr indexBuffer, SWIGTYPE_p_size_t indexBufferUsedSize, boolean extrudeVertices, float extrusionDistance, long flags) {
    return new SWIGTYPE_p_std__vectorT_Ogre__ShadowRenderable_p_t(OgreJNI.ShadowCaster_getShadowVolumeRenderableList__SWIG_0(swigCPtr, this, shadowTechnique.swigValue(), Light.getCPtr(light), light, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, SWIGTYPE_p_size_t.getCPtr(indexBufferUsedSize), extrudeVertices, extrusionDistance, flags), false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ShadowRenderable_p_t getShadowVolumeRenderableList(ShadowTechnique shadowTechnique, Light light, HardwareIndexBufferPtr indexBuffer, SWIGTYPE_p_size_t indexBufferUsedSize, boolean extrudeVertices, float extrusionDistance) {
    return new SWIGTYPE_p_std__vectorT_Ogre__ShadowRenderable_p_t(OgreJNI.ShadowCaster_getShadowVolumeRenderableList__SWIG_1(swigCPtr, this, shadowTechnique.swigValue(), Light.getCPtr(light), light, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, SWIGTYPE_p_size_t.getCPtr(indexBufferUsedSize), extrudeVertices, extrusionDistance), false);
  }

  public static void clearShadowRenderableList(SWIGTYPE_p_std__vectorT_Ogre__ShadowRenderable_p_t shadowRenderables) {
    OgreJNI.ShadowCaster_clearShadowRenderableList(SWIGTYPE_p_std__vectorT_Ogre__ShadowRenderable_p_t.getCPtr(shadowRenderables));
  }

  public static void extrudeVertices(HardwareVertexBufferPtr vertexBuffer, long originalVertexCount, Vector4 lightPos, float extrudeDist) {
    OgreJNI.ShadowCaster_extrudeVertices(HardwareVertexBufferPtr.getCPtr(vertexBuffer), vertexBuffer, originalVertexCount, Vector4.getCPtr(lightPos), lightPos, extrudeDist);
  }

  public float getPointExtrusionDistance(Light l) {
    return OgreJNI.ShadowCaster_getPointExtrusionDistance(swigCPtr, this, Light.getCPtr(l), l);
  }

}
