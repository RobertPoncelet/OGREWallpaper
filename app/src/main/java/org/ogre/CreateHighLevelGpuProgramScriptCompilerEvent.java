/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class CreateHighLevelGpuProgramScriptCompilerEvent extends CreateGpuProgramScriptCompilerEvent {
  private transient long swigCPtr;

  protected CreateHighLevelGpuProgramScriptCompilerEvent(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CreateHighLevelGpuProgramScriptCompilerEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CreateHighLevelGpuProgramScriptCompilerEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setMLanguage(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mLanguage_set(swigCPtr, this, value);
  }

  public String getMLanguage() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mLanguage_get(swigCPtr, this);
  }

  public static void setEventType(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_eventType_set(value);
  }

  public static String getEventType() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_eventType_get();
  }

  public CreateHighLevelGpuProgramScriptCompilerEvent(String file, String name, String resourceGroup, String source, String language, GpuProgramType programType) {
    this(OgreJNI.new_CreateHighLevelGpuProgramScriptCompilerEvent(file, name, resourceGroup, source, language, programType.swigValue()), true);
  }

}
