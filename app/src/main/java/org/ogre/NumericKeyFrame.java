/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class NumericKeyFrame extends KeyFrame {
  private transient long swigCPtr;

  protected NumericKeyFrame(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.NumericKeyFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NumericKeyFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_NumericKeyFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NumericKeyFrame(AnimationTrack parent, float time) {
    this(OgreJNI.new_NumericKeyFrame(AnimationTrack.getCPtr(parent), parent, time), true);
  }

  public AnyNumeric getValue() {
    return new AnyNumeric(OgreJNI.NumericKeyFrame_getValue(swigCPtr, this), false);
  }

  public void setValue(AnyNumeric val) {
    OgreJNI.NumericKeyFrame_setValue(swigCPtr, this, AnyNumeric.getCPtr(val), val);
  }

  public KeyFrame _clone(AnimationTrack newParent) {
    long cPtr = OgreJNI.NumericKeyFrame__clone(swigCPtr, this, AnimationTrack.getCPtr(newParent), newParent);
    return (cPtr == 0) ? null : new KeyFrame(cPtr, false);
  }

}
