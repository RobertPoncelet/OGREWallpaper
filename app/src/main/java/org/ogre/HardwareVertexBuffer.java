/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HardwareVertexBuffer extends HardwareBuffer {
  private transient long swigCPtr;

  protected HardwareVertexBuffer(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.HardwareVertexBuffer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HardwareVertexBuffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HardwareVertexBuffer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HardwareBufferManagerBase getManager() {
    long cPtr = OgreJNI.HardwareVertexBuffer_getManager(swigCPtr, this);
    return (cPtr == 0) ? null : new HardwareBufferManagerBase(cPtr, false);
  }

  public long getVertexSize() {
    return OgreJNI.HardwareVertexBuffer_getVertexSize(swigCPtr, this);
  }

  public long getNumVertices() {
    return OgreJNI.HardwareVertexBuffer_getNumVertices(swigCPtr, this);
  }

  public boolean isInstanceData() {
    return OgreJNI.HardwareVertexBuffer_isInstanceData(swigCPtr, this);
  }

  public void setIsInstanceData(boolean val) {
    OgreJNI.HardwareVertexBuffer_setIsInstanceData(swigCPtr, this, val);
  }

  public long getInstanceDataStepRate() {
    return OgreJNI.HardwareVertexBuffer_getInstanceDataStepRate(swigCPtr, this);
  }

  public void setInstanceDataStepRate(long val) {
    OgreJNI.HardwareVertexBuffer_setInstanceDataStepRate(swigCPtr, this, val);
  }

}
