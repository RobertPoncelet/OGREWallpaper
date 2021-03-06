/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Rectangle2D extends SimpleRenderable {
  private transient long swigCPtr;

  protected Rectangle2D(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.Rectangle2D_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Rectangle2D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Rectangle2D(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Rectangle2D(boolean includeTextureCoordinates, HardwareBuffer.Usage vBufUsage) {
    this(OgreJNI.new_Rectangle2D__SWIG_0(includeTextureCoordinates, vBufUsage.swigValue()), true);
  }

  public Rectangle2D(boolean includeTextureCoordinates) {
    this(OgreJNI.new_Rectangle2D__SWIG_1(includeTextureCoordinates), true);
  }

  public Rectangle2D() {
    this(OgreJNI.new_Rectangle2D__SWIG_2(), true);
  }

  public Rectangle2D(String name, boolean includeTextureCoordinates, HardwareBuffer.Usage vBufUsage) {
    this(OgreJNI.new_Rectangle2D__SWIG_3(name, includeTextureCoordinates, vBufUsage.swigValue()), true);
  }

  public Rectangle2D(String name, boolean includeTextureCoordinates) {
    this(OgreJNI.new_Rectangle2D__SWIG_4(name, includeTextureCoordinates), true);
  }

  public Rectangle2D(String name) {
    this(OgreJNI.new_Rectangle2D__SWIG_5(name), true);
  }

  public void setCorners(float left, float top, float right, float bottom, boolean updateAABB) {
    OgreJNI.Rectangle2D_setCorners__SWIG_0(swigCPtr, this, left, top, right, bottom, updateAABB);
  }

  public void setCorners(float left, float top, float right, float bottom) {
    OgreJNI.Rectangle2D_setCorners__SWIG_1(swigCPtr, this, left, top, right, bottom);
  }

  public void setNormals(Vector3 topLeft, Vector3 bottomLeft, Vector3 topRight, Vector3 bottomRight) {
    OgreJNI.Rectangle2D_setNormals(swigCPtr, this, Vector3.getCPtr(topLeft), topLeft, Vector3.getCPtr(bottomLeft), bottomLeft, Vector3.getCPtr(topRight), topRight, Vector3.getCPtr(bottomRight), bottomRight);
  }

  public void setUVs(Vector2 topLeft, Vector2 bottomLeft, Vector2 topRight, Vector2 bottomRight) {
    OgreJNI.Rectangle2D_setUVs(swigCPtr, this, Vector2.getCPtr(topLeft), topLeft, Vector2.getCPtr(bottomLeft), bottomLeft, Vector2.getCPtr(topRight), topRight, Vector2.getCPtr(bottomRight), bottomRight);
  }

  public void setDefaultUVs() {
    OgreJNI.Rectangle2D_setDefaultUVs(swigCPtr, this);
  }

  public float getSquaredViewDepth(Camera cam) {
    return OgreJNI.Rectangle2D_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public float getBoundingRadius() {
    return OgreJNI.Rectangle2D_getBoundingRadius(swigCPtr, this);
  }

}
