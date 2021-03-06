/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class VertexBufferBinding {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VertexBufferBinding(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VertexBufferBinding obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_VertexBufferBinding(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VertexBufferBinding() {
    this(OgreJNI.new_VertexBufferBinding(), true);
  }

  public void setBinding(int index, HardwareVertexBufferPtr buffer) {
    OgreJNI.VertexBufferBinding_setBinding(swigCPtr, this, index, HardwareVertexBufferPtr.getCPtr(buffer), buffer);
  }

  public void unsetBinding(int index) {
    OgreJNI.VertexBufferBinding_unsetBinding(swigCPtr, this, index);
  }

  public void unsetAllBindings() {
    OgreJNI.VertexBufferBinding_unsetAllBindings(swigCPtr, this);
  }

  public SWIGTYPE_p_std__mapT_unsigned_short_Ogre__SharedPtrT_Ogre__HardwareVertexBuffer_t_t getBindings() {
    return new SWIGTYPE_p_std__mapT_unsigned_short_Ogre__SharedPtrT_Ogre__HardwareVertexBuffer_t_t(OgreJNI.VertexBufferBinding_getBindings(swigCPtr, this), false);
  }

  public HardwareVertexBufferPtr getBuffer(int index) {
    return new HardwareVertexBufferPtr(OgreJNI.VertexBufferBinding_getBuffer(swigCPtr, this, index), false);
  }

  public boolean isBufferBound(int index) {
    return OgreJNI.VertexBufferBinding_isBufferBound(swigCPtr, this, index);
  }

  public long getBufferCount() {
    return OgreJNI.VertexBufferBinding_getBufferCount(swigCPtr, this);
  }

  public int getNextIndex() {
    return OgreJNI.VertexBufferBinding_getNextIndex(swigCPtr, this);
  }

  public int getLastBoundIndex() {
    return OgreJNI.VertexBufferBinding_getLastBoundIndex(swigCPtr, this);
  }

  public boolean hasGaps() {
    return OgreJNI.VertexBufferBinding_hasGaps(swigCPtr, this);
  }

  public void closeGaps(SWIGTYPE_p_std__mapT_unsigned_short_unsigned_short_t bindingIndexMap) {
    OgreJNI.VertexBufferBinding_closeGaps(swigCPtr, this, SWIGTYPE_p_std__mapT_unsigned_short_unsigned_short_t.getCPtr(bindingIndexMap));
  }

  public boolean hasInstanceData() {
    return OgreJNI.VertexBufferBinding_hasInstanceData(swigCPtr, this);
  }

}
