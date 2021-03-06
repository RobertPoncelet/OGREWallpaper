/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class DefaultSphereSceneQuery extends SphereSceneQuery {
  private transient long swigCPtr;

  protected DefaultSphereSceneQuery(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.DefaultSphereSceneQuery_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultSphereSceneQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_DefaultSphereSceneQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DefaultSphereSceneQuery(SceneManager creator) {
    this(OgreJNI.new_DefaultSphereSceneQuery(SceneManager.getCPtr(creator), creator), true);
  }

  public void execute(SceneQueryListener listener) {
    OgreJNI.DefaultSphereSceneQuery_execute(swigCPtr, this, SceneQueryListener.getCPtr(listener), listener);
  }

}
