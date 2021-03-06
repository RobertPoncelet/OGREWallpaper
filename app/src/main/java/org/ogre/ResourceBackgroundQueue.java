/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ResourceBackgroundQueue {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ResourceBackgroundQueue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResourceBackgroundQueue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ResourceBackgroundQueue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class Listener {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Listener(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Listener obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_ResourceBackgroundQueue_Listener(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    protected void swigDirectorDisconnect() {
      swigCMemOwn = false;
      delete();
    }
  
    public void swigReleaseOwnership() {
      swigCMemOwn = false;
      OgreJNI.ResourceBackgroundQueue_Listener_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OgreJNI.ResourceBackgroundQueue_Listener_change_ownership(this, swigCPtr, true);
    }
  
    public void operationCompleted(SWIGTYPE_p_Ogre__WorkQueue__RequestID ticket, BackgroundProcessResult result) {
      OgreJNI.ResourceBackgroundQueue_Listener_operationCompleted(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__RequestID.getCPtr(ticket), BackgroundProcessResult.getCPtr(result), result);
    }
  
    public Listener() {
      this(OgreJNI.new_ResourceBackgroundQueue_Listener(), true);
      OgreJNI.ResourceBackgroundQueue_Listener_director_connect(this, swigCPtr, swigCMemOwn, true);
    }
  
  }

  public ResourceBackgroundQueue() {
    this(OgreJNI.new_ResourceBackgroundQueue(), true);
  }

  public void initialise() {
    OgreJNI.ResourceBackgroundQueue_initialise(swigCPtr, this);
  }

  public void shutdown() {
    OgreJNI.ResourceBackgroundQueue_shutdown(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID initialiseResourceGroup(String name, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_initialiseResourceGroup__SWIG_0(swigCPtr, this, name, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID initialiseResourceGroup(String name) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_initialiseResourceGroup__SWIG_1(swigCPtr, this, name), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID initialiseAllResourceGroups(ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_initialiseAllResourceGroups__SWIG_0(swigCPtr, this, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID initialiseAllResourceGroups() {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_initialiseAllResourceGroups__SWIG_1(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepareResourceGroup(String name, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepareResourceGroup__SWIG_0(swigCPtr, this, name, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepareResourceGroup(String name) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepareResourceGroup__SWIG_1(swigCPtr, this, name), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID loadResourceGroup(String name, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_loadResourceGroup__SWIG_0(swigCPtr, this, name, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID loadResourceGroup(String name) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_loadResourceGroup__SWIG_1(swigCPtr, this, name), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID unload(String resType, String name, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_unload__SWIG_0(swigCPtr, this, resType, name, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID unload(String resType, String name) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_unload__SWIG_1(swigCPtr, this, resType, name), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID unload(String resType, long handle, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_unload__SWIG_2(swigCPtr, this, resType, handle, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID unload(String resType, long handle) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_unload__SWIG_3(swigCPtr, this, resType, handle), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID unloadResourceGroup(String name, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_unloadResourceGroup__SWIG_0(swigCPtr, this, name, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID unloadResourceGroup(String name) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_unloadResourceGroup__SWIG_1(swigCPtr, this, name), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepare(String resType, String name, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList loadParams, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepare__SWIG_0(swigCPtr, this, resType, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(loadParams), loadParams, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepare(String resType, String name, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList loadParams) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepare__SWIG_1(swigCPtr, this, resType, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(loadParams), loadParams), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepare(String resType, String name, String group, boolean isManual, ManualResourceLoader loader) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepare__SWIG_2(swigCPtr, this, resType, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepare(String resType, String name, String group, boolean isManual) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepare__SWIG_3(swigCPtr, this, resType, name, group, isManual), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID prepare(String resType, String name, String group) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_prepare__SWIG_4(swigCPtr, this, resType, name, group), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID load(String resType, String name, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList loadParams, ResourceBackgroundQueue.Listener listener) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_load__SWIG_0(swigCPtr, this, resType, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(loadParams), loadParams, ResourceBackgroundQueue.Listener.getCPtr(listener), listener), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID load(String resType, String name, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList loadParams) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_load__SWIG_1(swigCPtr, this, resType, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(loadParams), loadParams), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID load(String resType, String name, String group, boolean isManual, ManualResourceLoader loader) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_load__SWIG_2(swigCPtr, this, resType, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID load(String resType, String name, String group, boolean isManual) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_load__SWIG_3(swigCPtr, this, resType, name, group, isManual), true);
  }

  public SWIGTYPE_p_Ogre__WorkQueue__RequestID load(String resType, String name, String group) {
    return new SWIGTYPE_p_Ogre__WorkQueue__RequestID(OgreJNI.ResourceBackgroundQueue_load__SWIG_4(swigCPtr, this, resType, name, group), true);
  }

  public boolean isProcessComplete(SWIGTYPE_p_Ogre__WorkQueue__RequestID ticket) {
    return OgreJNI.ResourceBackgroundQueue_isProcessComplete(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__RequestID.getCPtr(ticket));
  }

  public void abortRequest(SWIGTYPE_p_Ogre__WorkQueue__RequestID ticket) {
    OgreJNI.ResourceBackgroundQueue_abortRequest(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__RequestID.getCPtr(ticket));
  }

  public boolean canHandleRequest(SWIGTYPE_p_Ogre__WorkQueue__Request req, SWIGTYPE_p_Ogre__WorkQueue srcQ) {
    return OgreJNI.ResourceBackgroundQueue_canHandleRequest(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__Request.getCPtr(req), SWIGTYPE_p_Ogre__WorkQueue.getCPtr(srcQ));
  }

  public SWIGTYPE_p_Ogre__WorkQueue__Response handleRequest(SWIGTYPE_p_Ogre__WorkQueue__Request req, SWIGTYPE_p_Ogre__WorkQueue srcQ) {
    long cPtr = OgreJNI.ResourceBackgroundQueue_handleRequest(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__Request.getCPtr(req), SWIGTYPE_p_Ogre__WorkQueue.getCPtr(srcQ));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__WorkQueue__Response(cPtr, false);
  }

  public boolean canHandleResponse(SWIGTYPE_p_Ogre__WorkQueue__Response res, SWIGTYPE_p_Ogre__WorkQueue srcQ) {
    return OgreJNI.ResourceBackgroundQueue_canHandleResponse(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__Response.getCPtr(res), SWIGTYPE_p_Ogre__WorkQueue.getCPtr(srcQ));
  }

  public void handleResponse(SWIGTYPE_p_Ogre__WorkQueue__Response res, SWIGTYPE_p_Ogre__WorkQueue srcQ) {
    OgreJNI.ResourceBackgroundQueue_handleResponse(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue__Response.getCPtr(res), SWIGTYPE_p_Ogre__WorkQueue.getCPtr(srcQ));
  }

  public static ResourceBackgroundQueue getSingleton() {
    return new ResourceBackgroundQueue(OgreJNI.ResourceBackgroundQueue_getSingleton(), false);
  }

}
