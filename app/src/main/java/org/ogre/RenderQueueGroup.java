/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class RenderQueueGroup {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RenderQueueGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RenderQueueGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RenderQueueGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RenderQueueGroup(RenderQueue parent, boolean splitPassesByLightingType, boolean splitNoShadowPasses, boolean shadowCastersNotReceivers) {
    this(OgreJNI.new_RenderQueueGroup(RenderQueue.getCPtr(parent), parent, splitPassesByLightingType, splitNoShadowPasses, shadowCastersNotReceivers), true);
  }

  public void addRenderable(Renderable pRend, Technique pTech, int priority) {
    OgreJNI.RenderQueueGroup_addRenderable(swigCPtr, this, Renderable.getCPtr(pRend), pRend, Technique.getCPtr(pTech), pTech, priority);
  }

  public void clear(boolean destroy) {
    OgreJNI.RenderQueueGroup_clear__SWIG_0(swigCPtr, this, destroy);
  }

  public void clear() {
    OgreJNI.RenderQueueGroup_clear__SWIG_1(swigCPtr, this);
  }

  public void setShadowsEnabled(boolean enabled) {
    OgreJNI.RenderQueueGroup_setShadowsEnabled(swigCPtr, this, enabled);
  }

  public boolean getShadowsEnabled() {
    return OgreJNI.RenderQueueGroup_getShadowsEnabled(swigCPtr, this);
  }

  public void setSplitPassesByLightingType(boolean split) {
    OgreJNI.RenderQueueGroup_setSplitPassesByLightingType(swigCPtr, this, split);
  }

  public void setSplitNoShadowPasses(boolean split) {
    OgreJNI.RenderQueueGroup_setSplitNoShadowPasses(swigCPtr, this, split);
  }

  public void setShadowCastersCannotBeReceivers(boolean ind) {
    OgreJNI.RenderQueueGroup_setShadowCastersCannotBeReceivers(swigCPtr, this, ind);
  }

  public void resetOrganisationModes() {
    OgreJNI.RenderQueueGroup_resetOrganisationModes(swigCPtr, this);
  }

  public void addOrganisationMode(QueuedRenderableCollection.OrganisationMode om) {
    OgreJNI.RenderQueueGroup_addOrganisationMode(swigCPtr, this, om.swigValue());
  }

  public void defaultOrganisationMode() {
    OgreJNI.RenderQueueGroup_defaultOrganisationMode(swigCPtr, this);
  }

  public void merge(RenderQueueGroup rhs) {
    OgreJNI.RenderQueueGroup_merge(swigCPtr, this, RenderQueueGroup.getCPtr(rhs), rhs);
  }

}
