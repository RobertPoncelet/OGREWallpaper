/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class SubMesh {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SubMesh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SubMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SubMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SubMesh() {
    this(OgreJNI.new_SubMesh(), true);
  }

  public void setUseSharedVertices(boolean value) {
    OgreJNI.SubMesh_useSharedVertices_set(swigCPtr, this, value);
  }

  public boolean getUseSharedVertices() {
    return OgreJNI.SubMesh_useSharedVertices_get(swigCPtr, this);
  }

  public void setOperationType(RenderOperation.OperationType value) {
    OgreJNI.SubMesh_operationType_set(swigCPtr, this, value.swigValue());
  }

  public RenderOperation.OperationType getOperationType() {
    return RenderOperation.OperationType.swigToEnum(OgreJNI.SubMesh_operationType_get(swigCPtr, this));
  }

  public void setVertexData(VertexData value) {
    OgreJNI.SubMesh_vertexData_set(swigCPtr, this, VertexData.getCPtr(value), value);
  }

  public VertexData getVertexData() {
    long cPtr = OgreJNI.SubMesh_vertexData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void setIndexData(IndexData value) {
    OgreJNI.SubMesh_indexData_set(swigCPtr, this, IndexData.getCPtr(value), value);
  }

  public IndexData getIndexData() {
    long cPtr = OgreJNI.SubMesh_indexData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IndexData(cPtr, false);
  }

  public void setBlendIndexToBoneIndexMap(SWIGTYPE_p_std__vectorT_unsigned_short_t value) {
    OgreJNI.SubMesh_blendIndexToBoneIndexMap_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_short_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_unsigned_short_t getBlendIndexToBoneIndexMap() {
    long cPtr = OgreJNI.SubMesh_blendIndexToBoneIndexMap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_unsigned_short_t(cPtr, false);
  }

  public void setMLodFaceList(SWIGTYPE_p_std__vectorT_Ogre__IndexData_p_t value) {
    OgreJNI.SubMesh_mLodFaceList_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_Ogre__IndexData_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_Ogre__IndexData_p_t getMLodFaceList() {
    long cPtr = OgreJNI.SubMesh_mLodFaceList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_Ogre__IndexData_p_t(cPtr, false);
  }

  public void setExtremityPoints(SWIGTYPE_p_std__vectorT_Ogre__VectorT_3_Ogre__Real_t_t value) {
    OgreJNI.SubMesh_extremityPoints_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_Ogre__VectorT_3_Ogre__Real_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_Ogre__VectorT_3_Ogre__Real_t_t getExtremityPoints() {
    long cPtr = OgreJNI.SubMesh_extremityPoints_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_Ogre__VectorT_3_Ogre__Real_t_t(cPtr, false);
  }

  public void setParent(Mesh value) {
    OgreJNI.SubMesh_parent_set(swigCPtr, this, Mesh.getCPtr(value), value);
  }

  public Mesh getParent() {
    long cPtr = OgreJNI.SubMesh_parent_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Mesh(cPtr, false);
  }

  public void setMaterialName(String matName, String groupName) {
    OgreJNI.SubMesh_setMaterialName__SWIG_0(swigCPtr, this, matName, groupName);
  }

  public void setMaterialName(String matName) {
    OgreJNI.SubMesh_setMaterialName__SWIG_1(swigCPtr, this, matName);
  }

  public String getMaterialName() {
    return OgreJNI.SubMesh_getMaterialName(swigCPtr, this);
  }

  public void setMaterial(MaterialPtr mat) {
    OgreJNI.SubMesh_setMaterial(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreJNI.SubMesh_getMaterial(swigCPtr, this), false);
  }

  public boolean isMatInitialised() {
    return OgreJNI.SubMesh_isMatInitialised(swigCPtr, this);
  }

  public void _getRenderOperation(RenderOperation rend, int lodIndex) {
    OgreJNI.SubMesh__getRenderOperation__SWIG_0(swigCPtr, this, RenderOperation.getCPtr(rend), rend, lodIndex);
  }

  public void _getRenderOperation(RenderOperation rend) {
    OgreJNI.SubMesh__getRenderOperation__SWIG_1(swigCPtr, this, RenderOperation.getCPtr(rend), rend);
  }

  public void addBoneAssignment(VertexBoneAssignment vertBoneAssign) {
    OgreJNI.SubMesh_addBoneAssignment(swigCPtr, this, VertexBoneAssignment.getCPtr(vertBoneAssign), vertBoneAssign);
  }

  public void clearBoneAssignments() {
    OgreJNI.SubMesh_clearBoneAssignments(swigCPtr, this);
  }

  public SWIGTYPE_p_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t getBoneAssignments() {
    return new SWIGTYPE_p_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t(OgreJNI.SubMesh_getBoneAssignments(swigCPtr, this), false);
  }

  public void _compileBoneAssignments() {
    OgreJNI.SubMesh__compileBoneAssignments(swigCPtr, this);
  }

  public void addTextureAlias(String aliasName, String textureName) {
    OgreJNI.SubMesh_addTextureAlias(swigCPtr, this, aliasName, textureName);
  }

  public void removeTextureAlias(String aliasName) {
    OgreJNI.SubMesh_removeTextureAlias(swigCPtr, this, aliasName);
  }

  public void removeAllTextureAliases() {
    OgreJNI.SubMesh_removeAllTextureAliases(swigCPtr, this);
  }

  public boolean hasTextureAliases() {
    return OgreJNI.SubMesh_hasTextureAliases(swigCPtr, this);
  }

  public long getTextureAliasCount() {
    return OgreJNI.SubMesh_getTextureAliasCount(swigCPtr, this);
  }

  public boolean updateMaterialUsingTextureAliases() {
    return OgreJNI.SubMesh_updateMaterialUsingTextureAliases(swigCPtr, this);
  }

  public VertexAnimationType getVertexAnimationType() {
    return VertexAnimationType.swigToEnum(OgreJNI.SubMesh_getVertexAnimationType(swigCPtr, this));
  }

  public boolean getVertexAnimationIncludesNormals() {
    return OgreJNI.SubMesh_getVertexAnimationIncludesNormals(swigCPtr, this);
  }

  public void generateExtremes(long count) {
    OgreJNI.SubMesh_generateExtremes(swigCPtr, this, count);
  }

  public boolean isBuildEdgesEnabled() {
    return OgreJNI.SubMesh_isBuildEdgesEnabled(swigCPtr, this);
  }

  public void setBuildEdgesEnabled(boolean b) {
    OgreJNI.SubMesh_setBuildEdgesEnabled(swigCPtr, this, b);
  }

  public SubMesh clone(String newName, Mesh parentMesh) {
    long cPtr = OgreJNI.SubMesh_clone__SWIG_0(swigCPtr, this, newName, Mesh.getCPtr(parentMesh), parentMesh);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public SubMesh clone(String newName) {
    long cPtr = OgreJNI.SubMesh_clone__SWIG_1(swigCPtr, this, newName);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

}
