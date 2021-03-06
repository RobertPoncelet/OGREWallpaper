/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class MouseWheelEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MouseWheelEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MouseWheelEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BitesJNI.delete_MouseWheelEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    BitesJNI.MouseWheelEvent_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return BitesJNI.MouseWheelEvent_type_get(swigCPtr, this);
  }

  public void setY(int value) {
    BitesJNI.MouseWheelEvent_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return BitesJNI.MouseWheelEvent_y_get(swigCPtr, this);
  }

  public MouseWheelEvent() {
    this(BitesJNI.new_MouseWheelEvent(), true);
  }

}
