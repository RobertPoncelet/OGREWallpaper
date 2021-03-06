/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Techniques {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Techniques(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Techniques obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Techniques(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Techniques() {
    this(OgreJNI.new_Techniques__SWIG_0(), true);
  }

  public Techniques(long n) {
    this(OgreJNI.new_Techniques__SWIG_1(n), true);
  }

  public long size() {
    return OgreJNI.Techniques_size(swigCPtr, this);
  }

  public long capacity() {
    return OgreJNI.Techniques_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    OgreJNI.Techniques_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return OgreJNI.Techniques_isEmpty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.Techniques_clear(swigCPtr, this);
  }

  public void add(Technique x) {
    OgreJNI.Techniques_add(swigCPtr, this, Technique.getCPtr(x), x);
  }

  public Technique get(int i) {
    long cPtr = OgreJNI.Techniques_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public void set(int i, Technique val) {
    OgreJNI.Techniques_set(swigCPtr, this, i, Technique.getCPtr(val), val);
  }

}
