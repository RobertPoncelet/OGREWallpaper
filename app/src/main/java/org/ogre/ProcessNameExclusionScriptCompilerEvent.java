/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ProcessNameExclusionScriptCompilerEvent extends ScriptCompilerEvent {
  private transient long swigCPtr;

  protected ProcessNameExclusionScriptCompilerEvent(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.ProcessNameExclusionScriptCompilerEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProcessNameExclusionScriptCompilerEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ProcessNameExclusionScriptCompilerEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setMClass(String value) {
    OgreJNI.ProcessNameExclusionScriptCompilerEvent_mClass_set(swigCPtr, this, value);
  }

  public String getMClass() {
    return OgreJNI.ProcessNameExclusionScriptCompilerEvent_mClass_get(swigCPtr, this);
  }

  public void setMParent(AbstractNode value) {
    OgreJNI.ProcessNameExclusionScriptCompilerEvent_mParent_set(swigCPtr, this, AbstractNode.getCPtr(value), value);
  }

  public AbstractNode getMParent() {
    long cPtr = OgreJNI.ProcessNameExclusionScriptCompilerEvent_mParent_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractNode(cPtr, false);
  }

  public static void setEventType(String value) {
    OgreJNI.ProcessNameExclusionScriptCompilerEvent_eventType_set(value);
  }

  public static String getEventType() {
    return OgreJNI.ProcessNameExclusionScriptCompilerEvent_eventType_get();
  }

  public ProcessNameExclusionScriptCompilerEvent(String cls, AbstractNode parent) {
    this(OgreJNI.new_ProcessNameExclusionScriptCompilerEvent(cls, AbstractNode.getCPtr(parent), parent), true);
  }

}
