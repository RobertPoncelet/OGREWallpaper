/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class DefaultSceneManager extends SceneManager {
  private transient long swigCPtr;

  protected DefaultSceneManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.DefaultSceneManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultSceneManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_DefaultSceneManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DefaultSceneManager(String name) {
    this(OgreJNI.new_DefaultSceneManager(name), true);
  }

  public String getTypeName() {
    return OgreJNI.DefaultSceneManager_getTypeName(swigCPtr, this);
  }

}
