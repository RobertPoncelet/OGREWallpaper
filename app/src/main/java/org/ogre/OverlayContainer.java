/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class OverlayContainer extends OverlayElement {
  private transient long swigCPtr;

  protected OverlayContainer(long cPtr, boolean cMemoryOwn) {
    super(OgreOverlayJNI.OverlayContainer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OverlayContainer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreOverlayJNI.delete_OverlayContainer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void addChild(OverlayElement elem) {
    OgreOverlayJNI.OverlayContainer_addChild(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void addChildImpl(OverlayElement elem) {
    OgreOverlayJNI.OverlayContainer_addChildImpl__SWIG_0(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void addChildImpl(OverlayContainer cont) {
    OgreOverlayJNI.OverlayContainer_addChildImpl__SWIG_1(swigCPtr, this, OverlayContainer.getCPtr(cont), cont);
  }

  public void removeChild(String name) {
    OgreOverlayJNI.OverlayContainer_removeChild(swigCPtr, this, name);
  }

  public OverlayElement getChild(String name) {
    long cPtr = OgreOverlayJNI.OverlayContainer_getChild(swigCPtr, this, name);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

  public void initialise() {
    OgreOverlayJNI.OverlayContainer_initialise(swigCPtr, this);
  }

  public void _addChild(OverlayElement elem) {
    OgreOverlayJNI.OverlayContainer__addChild(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void _removeChild(OverlayElement elem) {
    OgreOverlayJNI.OverlayContainer__removeChild__SWIG_0(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void _removeChild(String name) {
    OgreOverlayJNI.OverlayContainer__removeChild__SWIG_1(swigCPtr, this, name);
  }

  public SWIGTYPE_p_std__mapT_std__string_Ogre__OverlayElement_p_t getChildren() {
    return new SWIGTYPE_p_std__mapT_std__string_Ogre__OverlayElement_p_t(OgreOverlayJNI.OverlayContainer_getChildren(swigCPtr, this), false);
  }

  public void _positionsOutOfDate() {
    OgreOverlayJNI.OverlayContainer__positionsOutOfDate(swigCPtr, this);
  }

  public void _update() {
    OgreOverlayJNI.OverlayContainer__update(swigCPtr, this);
  }

  public int _notifyZOrder(int newZOrder) {
    return OgreOverlayJNI.OverlayContainer__notifyZOrder(swigCPtr, this, newZOrder);
  }

  public void _notifyViewport() {
    OgreOverlayJNI.OverlayContainer__notifyViewport(swigCPtr, this);
  }

  public void _notifyWorldTransforms(Matrix4 xform) {
    OgreOverlayJNI.OverlayContainer__notifyWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
  }

  public void _notifyParent(OverlayContainer parent, Overlay overlay) {
    OgreOverlayJNI.OverlayContainer__notifyParent(swigCPtr, this, OverlayContainer.getCPtr(parent), parent, Overlay.getCPtr(overlay), overlay);
  }

  public void _updateRenderQueue(RenderQueue queue) {
    OgreOverlayJNI.OverlayContainer__updateRenderQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public boolean isContainer() {
    return OgreOverlayJNI.OverlayContainer_isContainer(swigCPtr, this);
  }

  public boolean isChildrenProcessEvents() {
    return OgreOverlayJNI.OverlayContainer_isChildrenProcessEvents(swigCPtr, this);
  }

  public void setChildrenProcessEvents(boolean val) {
    OgreOverlayJNI.OverlayContainer_setChildrenProcessEvents(swigCPtr, this, val);
  }

  public OverlayElement findElementAt(float x, float y) {
    long cPtr = OgreOverlayJNI.OverlayContainer_findElementAt(swigCPtr, this, x, y);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

  public void copyFromTemplate(OverlayElement templateOverlay) {
    OgreOverlayJNI.OverlayContainer_copyFromTemplate(swigCPtr, this, OverlayElement.getCPtr(templateOverlay), templateOverlay);
  }

  public OverlayElement clone(String instanceName) {
    long cPtr = OgreOverlayJNI.OverlayContainer_clone(swigCPtr, this, instanceName);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

}
