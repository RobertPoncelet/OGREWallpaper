/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class FileNotFoundException extends OgreException {
  private transient long swigCPtr;

  protected FileNotFoundException(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.FileNotFoundException_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileNotFoundException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_FileNotFoundException(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FileNotFoundException(int inNumber, String inDescription, String inSource, String inFile, int inLine) {
    this(OgreJNI.new_FileNotFoundException(inNumber, inDescription, inSource, inFile, inLine), true);
  }

}
