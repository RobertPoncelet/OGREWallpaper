/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class VectorBase3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VectorBase3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorBase3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_VectorBase3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    OgreJNI.VectorBase3_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return OgreJNI.VectorBase3_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    OgreJNI.VectorBase3_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return OgreJNI.VectorBase3_y_get(swigCPtr, this);
  }

  public void setZ(float value) {
    OgreJNI.VectorBase3_z_set(swigCPtr, this, value);
  }

  public float getZ() {
    return OgreJNI.VectorBase3_z_get(swigCPtr, this);
  }

  public SWIGTYPE_p_float ptr() {
    long cPtr = OgreJNI.VectorBase3_ptr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public Vector3 crossProduct(Vector3 rkVector) {
    return new Vector3(OgreJNI.VectorBase3_crossProduct(swigCPtr, this, Vector3.getCPtr(rkVector), rkVector), true);
  }

  public Vector3 perpendicular() {
    return new Vector3(OgreJNI.VectorBase3_perpendicular(swigCPtr, this), true);
  }

  public float absDotProduct(VectorBase3 vec) {
    return OgreJNI.VectorBase3_absDotProduct(swigCPtr, this, VectorBase3.getCPtr(vec), vec);
  }

  public Vector3 midPoint(Vector3 vec) {
    return new Vector3(OgreJNI.VectorBase3_midPoint(swigCPtr, this, Vector3.getCPtr(vec), vec), true);
  }

  public Vector3 randomDeviant(Radian angle, Vector3 up) {
    return new Vector3(OgreJNI.VectorBase3_randomDeviant__SWIG_0(swigCPtr, this, Radian.getCPtr(angle), angle, Vector3.getCPtr(up), up), true);
  }

  public Vector3 randomDeviant(Radian angle) {
    return new Vector3(OgreJNI.VectorBase3_randomDeviant__SWIG_1(swigCPtr, this, Radian.getCPtr(angle), angle), true);
  }

  public Quaternion getRotationTo(Vector3 dest, Vector3 fallbackAxis) {
    return new Quaternion(OgreJNI.VectorBase3_getRotationTo__SWIG_0(swigCPtr, this, Vector3.getCPtr(dest), dest, Vector3.getCPtr(fallbackAxis), fallbackAxis), true);
  }

  public Quaternion getRotationTo(Vector3 dest) {
    return new Quaternion(OgreJNI.VectorBase3_getRotationTo__SWIG_1(swigCPtr, this, Vector3.getCPtr(dest), dest), true);
  }

  public boolean positionCloses(Vector3 rhs, float tolerance) {
    return OgreJNI.VectorBase3_positionCloses__SWIG_0(swigCPtr, this, Vector3.getCPtr(rhs), rhs, tolerance);
  }

  public boolean positionCloses(Vector3 rhs) {
    return OgreJNI.VectorBase3_positionCloses__SWIG_1(swigCPtr, this, Vector3.getCPtr(rhs), rhs);
  }

  public boolean directionEquals(Vector3 rhs, Radian tolerance) {
    return OgreJNI.VectorBase3_directionEquals(swigCPtr, this, Vector3.getCPtr(rhs), rhs, Radian.getCPtr(tolerance), tolerance);
  }

  public Vector3 primaryAxis() {
    return new Vector3(OgreJNI.VectorBase3_primaryAxis(swigCPtr, this), false);
  }

}
