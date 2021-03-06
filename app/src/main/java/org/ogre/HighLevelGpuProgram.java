/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HighLevelGpuProgram extends GpuProgram {
  private transient long swigCPtr;

  protected HighLevelGpuProgram(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.HighLevelGpuProgram_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HighLevelGpuProgram obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HighLevelGpuProgram(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t createParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.HighLevelGpuProgram_createParameters(swigCPtr, this), true);
  }

  public GpuProgram _getBindingDelegate() {
    long cPtr = OgreJNI.HighLevelGpuProgram__getBindingDelegate(swigCPtr, this);
    return (cPtr == 0) ? null : new GpuProgram(cPtr, false);
  }

  public GpuNamedConstants getConstantDefinitions() {
    return new GpuNamedConstants(OgreJNI.HighLevelGpuProgram_getConstantDefinitions(swigCPtr, this), false);
  }

  public long calculateSize() {
    return OgreJNI.HighLevelGpuProgram_calculateSize(swigCPtr, this);
  }

  public void setPreprocessorDefines(String defines) {
    OgreJNI.HighLevelGpuProgram_setPreprocessorDefines(swigCPtr, this, defines);
  }

  public String getPreprocessorDefines() {
    return OgreJNI.HighLevelGpuProgram_getPreprocessorDefines(swigCPtr, this);
  }

  public static String _resolveIncludes(String source, Resource resourceBeingLoaded, String fileName) {
    return OgreJNI.HighLevelGpuProgram__resolveIncludes(source, Resource.getCPtr(resourceBeingLoaded), resourceBeingLoaded, fileName);
  }

}
