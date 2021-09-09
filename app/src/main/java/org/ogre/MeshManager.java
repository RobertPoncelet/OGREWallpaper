/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class MeshManager extends ResourceManager {
  private transient long swigCPtr;

  protected MeshManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.MeshManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MeshManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MeshManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MeshManager() {
    this(OgreJNI.new_MeshManager(), true);
  }

  public void _initialise() {
    OgreJNI.MeshManager__initialise(swigCPtr, this);
  }

  public MeshPtr getByName(String name, String groupName) {
    return new MeshPtr(OgreJNI.MeshManager_getByName__SWIG_0(swigCPtr, this, name, groupName), true);
  }

  public MeshPtr getByName(String name) {
    return new MeshPtr(OgreJNI.MeshManager_getByName__SWIG_1(swigCPtr, this, name), true);
  }

  public MeshPtr create(String name, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList createParams) {
    return new MeshPtr(OgreJNI.MeshManager_create__SWIG_0(swigCPtr, this, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(createParams), createParams), true);
  }

  public MeshPtr create(String name, String group, boolean isManual, ManualResourceLoader loader) {
    return new MeshPtr(OgreJNI.MeshManager_create__SWIG_1(swigCPtr, this, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public MeshPtr create(String name, String group, boolean isManual) {
    return new MeshPtr(OgreJNI.MeshManager_create__SWIG_2(swigCPtr, this, name, group, isManual), true);
  }

  public MeshPtr create(String name, String group) {
    return new MeshPtr(OgreJNI.MeshManager_create__SWIG_3(swigCPtr, this, name, group), true);
  }

  public MeshPtr createManual(String name, String groupName, ManualResourceLoader loader) {
    return new MeshPtr(OgreJNI.MeshManager_createManual__SWIG_0(swigCPtr, this, name, groupName, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public MeshPtr createManual(String name, String groupName) {
    return new MeshPtr(OgreJNI.MeshManager_createManual__SWIG_1(swigCPtr, this, name, groupName), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer, boolean indexShadowBuffer) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_0(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer, indexShadowBuffer), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_1(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_2(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue()), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_3(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue()), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_4(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_5(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_6(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets, uTile), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals, int numTexCoordSets) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_7(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals, numTexCoordSets), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments, boolean normals) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_8(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments, normals), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments, int ysegments) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_9(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments, ysegments), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height, int xsegments) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_10(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, xsegments), true);
  }

  public MeshPtr createPlane(String name, String groupName, Plane plane, float width, float height) {
    return new MeshPtr(OgreJNI.MeshManager_createPlane__SWIG_11(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, Quaternion orientation, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer, boolean indexShadowBuffer, int ySegmentsToKeep) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_0(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, Quaternion.getCPtr(orientation), orientation, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer, indexShadowBuffer, ySegmentsToKeep), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, Quaternion orientation, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer, boolean indexShadowBuffer) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_1(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, Quaternion.getCPtr(orientation), orientation, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer, indexShadowBuffer), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, Quaternion orientation, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_2(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, Quaternion.getCPtr(orientation), orientation, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, Quaternion orientation, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_3(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, Quaternion.getCPtr(orientation), orientation, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue()), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, Quaternion orientation, HardwareBuffer.Usage vertexBufferUsage) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_4(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, Quaternion.getCPtr(orientation), orientation, vertexBufferUsage.swigValue()), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, Quaternion orientation) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_5(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, Quaternion.getCPtr(orientation), orientation), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_6(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_7(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_8(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets, uTile), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals, int numTexCoordSets) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_9(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals, numTexCoordSets), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments, boolean normals) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_10(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments, normals), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments, int ysegments) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_11(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments, ysegments), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature, int xsegments) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_12(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature, xsegments), true);
  }

  public MeshPtr createCurvedIllusionPlane(String name, String groupName, Plane plane, float width, float height, float curvature) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedIllusionPlane__SWIG_13(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, curvature), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer, boolean indexShadowBuffer) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_0(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer, indexShadowBuffer), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage, boolean vertexShadowBuffer) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_1(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue(), vertexShadowBuffer), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage, HardwareBuffer.Usage indexBufferUsage) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_2(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue(), indexBufferUsage.swigValue()), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector, HardwareBuffer.Usage vertexBufferUsage) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_3(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector, vertexBufferUsage.swigValue()), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile, Vector3 upVector) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_4(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile, Vector3.getCPtr(upVector), upVector), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile, float vTile) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_5(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile, vTile), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets, float uTile) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_6(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets, uTile), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals, int numTexCoordSets) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_7(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals, numTexCoordSets), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments, boolean normals) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_8(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments, normals), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments, int ysegments) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_9(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments, ysegments), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow, int xsegments) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_10(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow, xsegments), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height, float bow) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_11(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height, bow), true);
  }

  public MeshPtr createCurvedPlane(String name, String groupName, Plane plane, float width, float height) {
    return new MeshPtr(OgreJNI.MeshManager_createCurvedPlane__SWIG_12(swigCPtr, this, name, groupName, Plane.getCPtr(plane), plane, width, height), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel, PatchSurface.VisibleSide visibleSide, HardwareBuffer.Usage vbUsage, HardwareBuffer.Usage ibUsage, boolean vbUseShadow, boolean ibUseShadow) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_0(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel, vMaxSubdivisionLevel, visibleSide.swigValue(), vbUsage.swigValue(), ibUsage.swigValue(), vbUseShadow, ibUseShadow), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel, PatchSurface.VisibleSide visibleSide, HardwareBuffer.Usage vbUsage, HardwareBuffer.Usage ibUsage, boolean vbUseShadow) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_1(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel, vMaxSubdivisionLevel, visibleSide.swigValue(), vbUsage.swigValue(), ibUsage.swigValue(), vbUseShadow), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel, PatchSurface.VisibleSide visibleSide, HardwareBuffer.Usage vbUsage, HardwareBuffer.Usage ibUsage) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_2(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel, vMaxSubdivisionLevel, visibleSide.swigValue(), vbUsage.swigValue(), ibUsage.swigValue()), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel, PatchSurface.VisibleSide visibleSide, HardwareBuffer.Usage vbUsage) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_3(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel, vMaxSubdivisionLevel, visibleSide.swigValue(), vbUsage.swigValue()), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel, PatchSurface.VisibleSide visibleSide) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_4(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel, vMaxSubdivisionLevel, visibleSide.swigValue()), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_5(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel, vMaxSubdivisionLevel), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, long uMaxSubdivisionLevel) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_6(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, uMaxSubdivisionLevel), true);
  }

  public PatchMeshPtr createBezierPatch(String name, String groupName, SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height) {
    return new PatchMeshPtr(OgreJNI.MeshManager_createBezierPatch__SWIG_7(swigCPtr, this, name, groupName, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height), true);
  }

  public void setPrepareAllMeshesForShadowVolumes(boolean enable) {
    OgreJNI.MeshManager_setPrepareAllMeshesForShadowVolumes(swigCPtr, this, enable);
  }

  public boolean getPrepareAllMeshesForShadowVolumes() {
    return OgreJNI.MeshManager_getPrepareAllMeshesForShadowVolumes(swigCPtr, this);
  }

  public static MeshManager getSingleton() {
    return new MeshManager(OgreJNI.MeshManager_getSingleton(), false);
  }

  public VertexElementType getBlendWeightsBaseElementType() {
    return VertexElementType.swigToEnum(OgreJNI.MeshManager_getBlendWeightsBaseElementType(swigCPtr, this));
  }

  public void setBlendWeightsBaseElementType(VertexElementType vet) {
    OgreJNI.MeshManager_setBlendWeightsBaseElementType(swigCPtr, this, vet.swigValue());
  }

  public float getBoundsPaddingFactor() {
    return OgreJNI.MeshManager_getBoundsPaddingFactor(swigCPtr, this);
  }

  public void setBoundsPaddingFactor(float paddingFactor) {
    OgreJNI.MeshManager_setBoundsPaddingFactor(swigCPtr, this, paddingFactor);
  }

  public void setListener(MeshSerializerListener listener) {
    OgreJNI.MeshManager_setListener(swigCPtr, this, MeshSerializerListener.getCPtr(listener), listener);
  }

  public MeshSerializerListener getListener() {
    long cPtr = OgreJNI.MeshManager_getListener(swigCPtr, this);
    return (cPtr == 0) ? null : new MeshSerializerListener(cPtr, false);
  }

}
