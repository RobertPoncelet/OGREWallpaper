/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class IlluminationPass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IlluminationPass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IlluminationPass obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_IlluminationPass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStage(IlluminationStage value) {
    OgreJNI.IlluminationPass_stage_set(swigCPtr, this, value.swigValue());
  }

  public IlluminationStage getStage() {
    return IlluminationStage.swigToEnum(OgreJNI.IlluminationPass_stage_get(swigCPtr, this));
  }

  public void setPass(Pass value) {
    OgreJNI.IlluminationPass_pass_set(swigCPtr, this, Pass.getCPtr(value), value);
  }

  public Pass getPass() {
    long cPtr = OgreJNI.IlluminationPass_pass_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public void setDestroyOnShutdown(boolean value) {
    OgreJNI.IlluminationPass_destroyOnShutdown_set(swigCPtr, this, value);
  }

  public boolean getDestroyOnShutdown() {
    return OgreJNI.IlluminationPass_destroyOnShutdown_get(swigCPtr, this);
  }

  public void setOriginalPass(Pass value) {
    OgreJNI.IlluminationPass_originalPass_set(swigCPtr, this, Pass.getCPtr(value), value);
  }

  public Pass getOriginalPass() {
    long cPtr = OgreJNI.IlluminationPass_originalPass_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public IlluminationPass() {
    this(OgreJNI.new_IlluminationPass(), true);
  }

}
