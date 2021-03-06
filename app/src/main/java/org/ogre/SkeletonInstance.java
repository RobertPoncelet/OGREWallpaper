/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class SkeletonInstance extends Skeleton {
  private transient long swigCPtr;

  protected SkeletonInstance(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.SkeletonInstance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SkeletonInstance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SkeletonInstance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SkeletonInstance(SkeletonPtr masterCopy) {
    this(OgreJNI.new_SkeletonInstance(SkeletonPtr.getCPtr(masterCopy), masterCopy), true);
  }

  public int getNumAnimations() {
    return OgreJNI.SkeletonInstance_getNumAnimations(swigCPtr, this);
  }

  public Animation getAnimation(int index) {
    long cPtr = OgreJNI.SkeletonInstance_getAnimation__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation _getAnimationImpl(String name, SWIGTYPE_p_p_Ogre__LinkedSkeletonAnimationSource linker) {
    long cPtr = OgreJNI.SkeletonInstance__getAnimationImpl__SWIG_0(swigCPtr, this, name, SWIGTYPE_p_p_Ogre__LinkedSkeletonAnimationSource.getCPtr(linker));
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation _getAnimationImpl(String name) {
    long cPtr = OgreJNI.SkeletonInstance__getAnimationImpl__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation createAnimation(String name, float length) {
    long cPtr = OgreJNI.SkeletonInstance_createAnimation(swigCPtr, this, name, length);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation getAnimation(String name, SWIGTYPE_p_p_Ogre__LinkedSkeletonAnimationSource linker) {
    long cPtr = OgreJNI.SkeletonInstance_getAnimation__SWIG_1(swigCPtr, this, name, SWIGTYPE_p_p_Ogre__LinkedSkeletonAnimationSource.getCPtr(linker));
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation getAnimation(String name) {
    long cPtr = OgreJNI.SkeletonInstance_getAnimation__SWIG_2(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public void removeAnimation(String name) {
    OgreJNI.SkeletonInstance_removeAnimation(swigCPtr, this, name);
  }

  public SWIGTYPE_p_Ogre__TagPoint createTagPointOnBone(Bone bone, Quaternion offsetOrientation, Vector3 offsetPosition) {
    long cPtr = OgreJNI.SkeletonInstance_createTagPointOnBone__SWIG_0(swigCPtr, this, Bone.getCPtr(bone), bone, Quaternion.getCPtr(offsetOrientation), offsetOrientation, Vector3.getCPtr(offsetPosition), offsetPosition);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__TagPoint(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__TagPoint createTagPointOnBone(Bone bone, Quaternion offsetOrientation) {
    long cPtr = OgreJNI.SkeletonInstance_createTagPointOnBone__SWIG_1(swigCPtr, this, Bone.getCPtr(bone), bone, Quaternion.getCPtr(offsetOrientation), offsetOrientation);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__TagPoint(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__TagPoint createTagPointOnBone(Bone bone) {
    long cPtr = OgreJNI.SkeletonInstance_createTagPointOnBone__SWIG_2(swigCPtr, this, Bone.getCPtr(bone), bone);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__TagPoint(cPtr, false);
  }

  public void freeTagPoint(SWIGTYPE_p_Ogre__TagPoint tagPoint) {
    OgreJNI.SkeletonInstance_freeTagPoint(swigCPtr, this, SWIGTYPE_p_Ogre__TagPoint.getCPtr(tagPoint));
  }

  public void addLinkedSkeletonAnimationSource(String skelName, float scale) {
    OgreJNI.SkeletonInstance_addLinkedSkeletonAnimationSource__SWIG_0(swigCPtr, this, skelName, scale);
  }

  public void addLinkedSkeletonAnimationSource(String skelName) {
    OgreJNI.SkeletonInstance_addLinkedSkeletonAnimationSource__SWIG_1(swigCPtr, this, skelName);
  }

  public void removeAllLinkedSkeletonAnimationSources() {
    OgreJNI.SkeletonInstance_removeAllLinkedSkeletonAnimationSources(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__LinkedSkeletonAnimationSource_t getLinkedSkeletonAnimationSources() {
    return new SWIGTYPE_p_std__vectorT_Ogre__LinkedSkeletonAnimationSource_t(OgreJNI.SkeletonInstance_getLinkedSkeletonAnimationSources(swigCPtr, this), false);
  }

  public void _initAnimationState(AnimationStateSet animSet) {
    OgreJNI.SkeletonInstance__initAnimationState(swigCPtr, this, AnimationStateSet.getCPtr(animSet), animSet);
  }

  public void _refreshAnimationState(AnimationStateSet animSet) {
    OgreJNI.SkeletonInstance__refreshAnimationState(swigCPtr, this, AnimationStateSet.getCPtr(animSet), animSet);
  }

  public String getName() {
    return OgreJNI.SkeletonInstance_getName(swigCPtr, this);
  }

  public long getHandle() {
    return OgreJNI.SkeletonInstance_getHandle(swigCPtr, this);
  }

  public String getGroup() {
    return OgreJNI.SkeletonInstance_getGroup(swigCPtr, this);
  }

}
