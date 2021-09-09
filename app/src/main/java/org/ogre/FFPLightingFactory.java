/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class FFPLightingFactory extends SubRenderStateFactory {
  private transient long swigCPtr;

  protected FFPLightingFactory(long cPtr, boolean cMemoryOwn) {
    super(RTShaderJNI.FFPLightingFactory_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FFPLightingFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RTShaderJNI.delete_FFPLightingFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubRenderState createInstance(ScriptCompiler compiler, PropertyAbstractNode prop, Pass pass, SGScriptTranslator translator) {
    long cPtr = RTShaderJNI.FFPLightingFactory_createInstance(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, PropertyAbstractNode.getCPtr(prop), prop, Pass.getCPtr(pass), pass, SGScriptTranslator.getCPtr(translator), translator);
    return (cPtr == 0) ? null : new SubRenderState(cPtr, false);
  }

  public void writeInstance(MaterialSerializer ser, SubRenderState subRenderState, Pass srcPass, Pass dstPass) {
    RTShaderJNI.FFPLightingFactory_writeInstance(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, SubRenderState.getCPtr(subRenderState), subRenderState, Pass.getCPtr(srcPass), srcPass, Pass.getCPtr(dstPass), dstPass);
  }

  public FFPLightingFactory() {
    this(RTShaderJNI.new_FFPLightingFactory(), true);
  }

}
