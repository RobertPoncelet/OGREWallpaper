/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ParamDictionary {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ParamDictionary(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParamDictionary obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ParamDictionary(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ParamDictionary() {
    this(OgreJNI.new_ParamDictionary(), true);
  }

  public void addParameter(ParameterDef paramDef, ParamCommand paramCmd) {
    OgreJNI.ParamDictionary_addParameter(swigCPtr, this, ParameterDef.getCPtr(paramDef), paramDef, ParamCommand.getCPtr(paramCmd), paramCmd);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t getParameters() {
    return new SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t(OgreJNI.ParamDictionary_getParameters(swigCPtr, this), false);
  }

}
