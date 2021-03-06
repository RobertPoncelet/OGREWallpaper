/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class NameValuePairList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NameValuePairList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NameValuePairList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_NameValuePairList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NameValuePairList() {
    this(OgreJNI.new_NameValuePairList__SWIG_0(), true);
  }

  public NameValuePairList(NameValuePairList arg0) {
    this(OgreJNI.new_NameValuePairList__SWIG_1(NameValuePairList.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return OgreJNI.NameValuePairList_size(swigCPtr, this);
  }

  public boolean empty() {
    return OgreJNI.NameValuePairList_empty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.NameValuePairList_clear(swigCPtr, this);
  }

  public String get(String key) {
    return OgreJNI.NameValuePairList_get(swigCPtr, this, key);
  }

  public void set(String key, String x) {
    OgreJNI.NameValuePairList_set(swigCPtr, this, key, x);
  }

  public void del(String key) {
    OgreJNI.NameValuePairList_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return OgreJNI.NameValuePairList_has_key(swigCPtr, this, key);
  }

}
