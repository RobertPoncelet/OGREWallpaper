/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class PanelOverlayElementPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PanelOverlayElementPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PanelOverlayElementPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreOverlayJNI.delete_PanelOverlayElementPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PanelOverlayElementPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreOverlayJNI.new_PanelOverlayElementPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public PanelOverlayElementPtr() {
    this(OgreOverlayJNI.new_PanelOverlayElementPtr__SWIG_1(), true);
  }

  public PanelOverlayElementPtr(PanelOverlayElementPtr r) {
    this(OgreOverlayJNI.new_PanelOverlayElementPtr__SWIG_2(PanelOverlayElementPtr.getCPtr(r), r), true);
  }

  public PanelOverlayElement __deref__() {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new PanelOverlayElement(cPtr, false);
  }

  public void initialise() {
    OgreOverlayJNI.PanelOverlayElementPtr_initialise(swigCPtr, this);
  }

  public void _releaseManualHardwareResources() {
    OgreOverlayJNI.PanelOverlayElementPtr__releaseManualHardwareResources(swigCPtr, this);
  }

  public void _restoreManualHardwareResources() {
    OgreOverlayJNI.PanelOverlayElementPtr__restoreManualHardwareResources(swigCPtr, this);
  }

  public void setTiling(float x, float y, int layer) {
    OgreOverlayJNI.PanelOverlayElementPtr_setTiling__SWIG_0(swigCPtr, this, x, y, layer);
  }

  public void setTiling(float x, float y) {
    OgreOverlayJNI.PanelOverlayElementPtr_setTiling__SWIG_1(swigCPtr, this, x, y);
  }

  public float getTileX(int layer) {
    return OgreOverlayJNI.PanelOverlayElementPtr_getTileX__SWIG_0(swigCPtr, this, layer);
  }

  public float getTileX() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getTileX__SWIG_1(swigCPtr, this);
  }

  public float getTileY(int layer) {
    return OgreOverlayJNI.PanelOverlayElementPtr_getTileY__SWIG_0(swigCPtr, this, layer);
  }

  public float getTileY() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getTileY__SWIG_1(swigCPtr, this);
  }

  public void setUV(float u1, float v1, float u2, float v2) {
    OgreOverlayJNI.PanelOverlayElementPtr_setUV(swigCPtr, this, u1, v1, u2, v2);
  }

  public void getUV(SWIGTYPE_p_float u1, SWIGTYPE_p_float v1, SWIGTYPE_p_float u2, SWIGTYPE_p_float v2) {
    OgreOverlayJNI.PanelOverlayElementPtr_getUV(swigCPtr, this, SWIGTYPE_p_float.getCPtr(u1), SWIGTYPE_p_float.getCPtr(v1), SWIGTYPE_p_float.getCPtr(u2), SWIGTYPE_p_float.getCPtr(v2));
  }

  public void setTransparent(boolean isTransparent) {
    OgreOverlayJNI.PanelOverlayElementPtr_setTransparent(swigCPtr, this, isTransparent);
  }

  public boolean isTransparent() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isTransparent(swigCPtr, this);
  }

  public String getTypeName() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getTypeName(swigCPtr, this);
  }

  public void getRenderOperation(RenderOperation op) {
    OgreOverlayJNI.PanelOverlayElementPtr_getRenderOperation(swigCPtr, this, RenderOperation.getCPtr(op), op);
  }

  public void _updateRenderQueue(RenderQueue queue) {
    OgreOverlayJNI.PanelOverlayElementPtr__updateRenderQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public void addChild(OverlayElement elem) {
    OgreOverlayJNI.PanelOverlayElementPtr_addChild(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void addChildImpl(OverlayElement elem) {
    OgreOverlayJNI.PanelOverlayElementPtr_addChildImpl__SWIG_0(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void addChildImpl(OverlayContainer cont) {
    OgreOverlayJNI.PanelOverlayElementPtr_addChildImpl__SWIG_1(swigCPtr, this, OverlayContainer.getCPtr(cont), cont);
  }

  public void removeChild(String name) {
    OgreOverlayJNI.PanelOverlayElementPtr_removeChild(swigCPtr, this, name);
  }

  public OverlayElement getChild(String name) {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_getChild(swigCPtr, this, name);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

  public void _addChild(OverlayElement elem) {
    OgreOverlayJNI.PanelOverlayElementPtr__addChild(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void _removeChild(OverlayElement elem) {
    OgreOverlayJNI.PanelOverlayElementPtr__removeChild__SWIG_0(swigCPtr, this, OverlayElement.getCPtr(elem), elem);
  }

  public void _removeChild(String name) {
    OgreOverlayJNI.PanelOverlayElementPtr__removeChild__SWIG_1(swigCPtr, this, name);
  }

  public SWIGTYPE_p_std__mapT_std__string_Ogre__OverlayElement_p_t getChildren() {
    return new SWIGTYPE_p_std__mapT_std__string_Ogre__OverlayElement_p_t(OgreOverlayJNI.PanelOverlayElementPtr_getChildren(swigCPtr, this), false);
  }

  public void _positionsOutOfDate() {
    OgreOverlayJNI.PanelOverlayElementPtr__positionsOutOfDate(swigCPtr, this);
  }

  public void _update() {
    OgreOverlayJNI.PanelOverlayElementPtr__update(swigCPtr, this);
  }

  public int _notifyZOrder(int newZOrder) {
    return OgreOverlayJNI.PanelOverlayElementPtr__notifyZOrder(swigCPtr, this, newZOrder);
  }

  public void _notifyViewport() {
    OgreOverlayJNI.PanelOverlayElementPtr__notifyViewport(swigCPtr, this);
  }

  public void _notifyWorldTransforms(Matrix4 xform) {
    OgreOverlayJNI.PanelOverlayElementPtr__notifyWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
  }

  public void _notifyParent(OverlayContainer parent, Overlay overlay) {
    OgreOverlayJNI.PanelOverlayElementPtr__notifyParent(swigCPtr, this, OverlayContainer.getCPtr(parent), parent, Overlay.getCPtr(overlay), overlay);
  }

  public boolean isContainer() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isContainer(swigCPtr, this);
  }

  public boolean isChildrenProcessEvents() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isChildrenProcessEvents(swigCPtr, this);
  }

  public void setChildrenProcessEvents(boolean val) {
    OgreOverlayJNI.PanelOverlayElementPtr_setChildrenProcessEvents(swigCPtr, this, val);
  }

  public OverlayElement findElementAt(float x, float y) {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_findElementAt(swigCPtr, this, x, y);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

  public void copyFromTemplate(OverlayElement templateOverlay) {
    OgreOverlayJNI.PanelOverlayElementPtr_copyFromTemplate(swigCPtr, this, OverlayElement.getCPtr(templateOverlay), templateOverlay);
  }

  public OverlayElement clone(String instanceName) {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_clone(swigCPtr, this, instanceName);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

  public String getDEFAULT_RESOURCE_GROUP() {
    return OgreOverlayJNI.PanelOverlayElementPtr_DEFAULT_RESOURCE_GROUP_get(swigCPtr, this);
  }

  public String getName() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getName(swigCPtr, this);
  }

  public void show() {
    OgreOverlayJNI.PanelOverlayElementPtr_show(swigCPtr, this);
  }

  public void hide() {
    OgreOverlayJNI.PanelOverlayElementPtr_hide(swigCPtr, this);
  }

  public boolean isVisible() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isVisible(swigCPtr, this);
  }

  public boolean isEnabled() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isEnabled(swigCPtr, this);
  }

  public void setEnabled(boolean b) {
    OgreOverlayJNI.PanelOverlayElementPtr_setEnabled(swigCPtr, this, b);
  }

  public void setDimensions(float width, float height) {
    OgreOverlayJNI.PanelOverlayElementPtr_setDimensions(swigCPtr, this, width, height);
  }

  public void setPosition(float left, float top) {
    OgreOverlayJNI.PanelOverlayElementPtr_setPosition(swigCPtr, this, left, top);
  }

  public void setWidth(float width) {
    OgreOverlayJNI.PanelOverlayElementPtr_setWidth(swigCPtr, this, width);
  }

  public float getWidth() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getWidth(swigCPtr, this);
  }

  public void setHeight(float height) {
    OgreOverlayJNI.PanelOverlayElementPtr_setHeight(swigCPtr, this, height);
  }

  public float getHeight() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getHeight(swigCPtr, this);
  }

  public void setLeft(float left) {
    OgreOverlayJNI.PanelOverlayElementPtr_setLeft(swigCPtr, this, left);
  }

  public float getLeft() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getLeft(swigCPtr, this);
  }

  public void setTop(float Top) {
    OgreOverlayJNI.PanelOverlayElementPtr_setTop(swigCPtr, this, Top);
  }

  public float getTop() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getTop(swigCPtr, this);
  }

  public float _getLeft() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getLeft(swigCPtr, this);
  }

  public float _getTop() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getTop(swigCPtr, this);
  }

  public float _getWidth() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getWidth(swigCPtr, this);
  }

  public float _getHeight() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getHeight(swigCPtr, this);
  }

  public void _setLeft(float left) {
    OgreOverlayJNI.PanelOverlayElementPtr__setLeft(swigCPtr, this, left);
  }

  public void _setTop(float top) {
    OgreOverlayJNI.PanelOverlayElementPtr__setTop(swigCPtr, this, top);
  }

  public void _setWidth(float width) {
    OgreOverlayJNI.PanelOverlayElementPtr__setWidth(swigCPtr, this, width);
  }

  public void _setHeight(float height) {
    OgreOverlayJNI.PanelOverlayElementPtr__setHeight(swigCPtr, this, height);
  }

  public void _setPosition(float left, float top) {
    OgreOverlayJNI.PanelOverlayElementPtr__setPosition(swigCPtr, this, left, top);
  }

  public void _setDimensions(float width, float height) {
    OgreOverlayJNI.PanelOverlayElementPtr__setDimensions(swigCPtr, this, width, height);
  }

  public String getMaterialName() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getMaterialName(swigCPtr, this);
  }

  public void setMaterial(MaterialPtr mat) {
    OgreOverlayJNI.PanelOverlayElementPtr_setMaterial(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

  public void setMaterialName(String matName, String group) {
    OgreOverlayJNI.PanelOverlayElementPtr_setMaterialName__SWIG_0(swigCPtr, this, matName, group);
  }

  public void setMaterialName(String matName) {
    OgreOverlayJNI.PanelOverlayElementPtr_setMaterialName__SWIG_1(swigCPtr, this, matName);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreOverlayJNI.PanelOverlayElementPtr_getMaterial(swigCPtr, this), false);
  }

  public void getWorldTransforms(Matrix4 xform) {
    OgreOverlayJNI.PanelOverlayElementPtr_getWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
  }

  public void _updateFromParent() {
    OgreOverlayJNI.PanelOverlayElementPtr__updateFromParent(swigCPtr, this);
  }

  public float _getDerivedLeft() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getDerivedLeft(swigCPtr, this);
  }

  public float _getDerivedTop() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getDerivedTop(swigCPtr, this);
  }

  public float _getRelativeWidth() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getRelativeWidth(swigCPtr, this);
  }

  public float _getRelativeHeight() {
    return OgreOverlayJNI.PanelOverlayElementPtr__getRelativeHeight(swigCPtr, this);
  }

  public void _getClippingRegion(FloatRect clippingRegion) {
    OgreOverlayJNI.PanelOverlayElementPtr__getClippingRegion(swigCPtr, this, FloatRect.getCPtr(clippingRegion), clippingRegion);
  }

  public void visitRenderables(Renderable.Visitor visitor, boolean debugRenderables) {
    OgreOverlayJNI.PanelOverlayElementPtr_visitRenderables__SWIG_0(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor, debugRenderables);
  }

  public void visitRenderables(Renderable.Visitor visitor) {
    OgreOverlayJNI.PanelOverlayElementPtr_visitRenderables__SWIG_1(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor);
  }

  public void setCaption(SWIGTYPE_p_UTFString text) {
    OgreOverlayJNI.PanelOverlayElementPtr_setCaption(swigCPtr, this, SWIGTYPE_p_UTFString.getCPtr(text));
  }

  public SWIGTYPE_p_UTFString getCaption() {
    return new SWIGTYPE_p_UTFString(OgreOverlayJNI.PanelOverlayElementPtr_getCaption(swigCPtr, this), false);
  }

  public void setColour(ColourValue col) {
    OgreOverlayJNI.PanelOverlayElementPtr_setColour(swigCPtr, this, ColourValue.getCPtr(col), col);
  }

  public ColourValue getColour() {
    return new ColourValue(OgreOverlayJNI.PanelOverlayElementPtr_getColour(swigCPtr, this), false);
  }

  public void setMetricsMode(GuiMetricsMode gmm) {
    OgreOverlayJNI.PanelOverlayElementPtr_setMetricsMode(swigCPtr, this, gmm.swigValue());
  }

  public GuiMetricsMode getMetricsMode() {
    return GuiMetricsMode.swigToEnum(OgreOverlayJNI.PanelOverlayElementPtr_getMetricsMode(swigCPtr, this));
  }

  public void setHorizontalAlignment(GuiHorizontalAlignment gha) {
    OgreOverlayJNI.PanelOverlayElementPtr_setHorizontalAlignment(swigCPtr, this, gha.swigValue());
  }

  public GuiHorizontalAlignment getHorizontalAlignment() {
    return GuiHorizontalAlignment.swigToEnum(OgreOverlayJNI.PanelOverlayElementPtr_getHorizontalAlignment(swigCPtr, this));
  }

  public void setVerticalAlignment(GuiVerticalAlignment gva) {
    OgreOverlayJNI.PanelOverlayElementPtr_setVerticalAlignment(swigCPtr, this, gva.swigValue());
  }

  public GuiVerticalAlignment getVerticalAlignment() {
    return GuiVerticalAlignment.swigToEnum(OgreOverlayJNI.PanelOverlayElementPtr_getVerticalAlignment(swigCPtr, this));
  }

  public boolean contains(float x, float y) {
    return OgreOverlayJNI.PanelOverlayElementPtr_contains(swigCPtr, this, x, y);
  }

  public boolean isKeyEnabled() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isKeyEnabled(swigCPtr, this);
  }

  public boolean isCloneable() {
    return OgreOverlayJNI.PanelOverlayElementPtr_isCloneable(swigCPtr, this);
  }

  public void setCloneable(boolean c) {
    OgreOverlayJNI.PanelOverlayElementPtr_setCloneable(swigCPtr, this, c);
  }

  public OverlayContainer getParent() {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new OverlayContainer(cPtr, false);
  }

  public void _setParent(OverlayContainer parent) {
    OgreOverlayJNI.PanelOverlayElementPtr__setParent(swigCPtr, this, OverlayContainer.getCPtr(parent), parent);
  }

  public int getZOrder() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getZOrder(swigCPtr, this);
  }

  public float getSquaredViewDepth(Camera cam) {
    return OgreOverlayJNI.PanelOverlayElementPtr_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t getLights() {
    return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreOverlayJNI.PanelOverlayElementPtr_getLights(swigCPtr, this), false);
  }

  public OverlayElement getSourceTemplate() {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_getSourceTemplate(swigCPtr, this);
    return (cPtr == 0) ? null : new OverlayElement(cPtr, false);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t getParameters() {
    return new SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t(OgreOverlayJNI.PanelOverlayElementPtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreOverlayJNI.PanelOverlayElementPtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(NameValuePairList paramList) {
    OgreOverlayJNI.PanelOverlayElementPtr_setParameterList(swigCPtr, this, NameValuePairList.getCPtr(paramList), paramList);
  }

  public String getParameter(String name) {
    return OgreOverlayJNI.PanelOverlayElementPtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreOverlayJNI.PanelOverlayElementPtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreOverlayJNI.PanelOverlayElementPtr_cleanupDictionary(swigCPtr, this);
  }

  public Technique getTechnique() {
    long cPtr = OgreOverlayJNI.PanelOverlayElementPtr_getTechnique(swigCPtr, this);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public boolean preRender(SceneManager sm, RenderSystem rsys) {
    return OgreOverlayJNI.PanelOverlayElementPtr_preRender(swigCPtr, this, SceneManager.getCPtr(sm), sm, RenderSystem.getCPtr(rsys), rsys);
  }

  public void postRender(SceneManager sm, RenderSystem rsys) {
    OgreOverlayJNI.PanelOverlayElementPtr_postRender(swigCPtr, this, SceneManager.getCPtr(sm), sm, RenderSystem.getCPtr(rsys), rsys);
  }

  public int getNumWorldTransforms() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getNumWorldTransforms(swigCPtr, this);
  }

  public void setUseIdentityProjection(boolean useIdentityProjection) {
    OgreOverlayJNI.PanelOverlayElementPtr_setUseIdentityProjection(swigCPtr, this, useIdentityProjection);
  }

  public boolean getUseIdentityProjection() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getUseIdentityProjection(swigCPtr, this);
  }

  public void setUseIdentityView(boolean useIdentityView) {
    OgreOverlayJNI.PanelOverlayElementPtr_setUseIdentityView(swigCPtr, this, useIdentityView);
  }

  public boolean getUseIdentityView() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getUseIdentityView(swigCPtr, this);
  }

  public boolean getCastsShadows() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getCastsShadows(swigCPtr, this);
  }

  public void setCustomParameter(long index, Vector4 value) {
    OgreOverlayJNI.PanelOverlayElementPtr_setCustomParameter(swigCPtr, this, index, Vector4.getCPtr(value), value);
  }

  public void removeCustomParameter(long index) {
    OgreOverlayJNI.PanelOverlayElementPtr_removeCustomParameter(swigCPtr, this, index);
  }

  public boolean hasCustomParameter(long index) {
    return OgreOverlayJNI.PanelOverlayElementPtr_hasCustomParameter(swigCPtr, this, index);
  }

  public Vector4 getCustomParameter(long index) {
    return new Vector4(OgreOverlayJNI.PanelOverlayElementPtr_getCustomParameter(swigCPtr, this, index), false);
  }

  public void _updateCustomGpuParameter(GpuProgramParameters.AutoConstantEntry constantEntry, GpuProgramParameters params) {
    OgreOverlayJNI.PanelOverlayElementPtr__updateCustomGpuParameter(swigCPtr, this, GpuProgramParameters.AutoConstantEntry.getCPtr(constantEntry), constantEntry, GpuProgramParameters.getCPtr(params), params);
  }

  public void setPolygonModeOverrideable(boolean override) {
    OgreOverlayJNI.PanelOverlayElementPtr_setPolygonModeOverrideable(swigCPtr, this, override);
  }

  public boolean getPolygonModeOverrideable() {
    return OgreOverlayJNI.PanelOverlayElementPtr_getPolygonModeOverrideable(swigCPtr, this);
  }

  public UserObjectBindings getUserObjectBindings() {
    return new UserObjectBindings(OgreOverlayJNI.PanelOverlayElementPtr_getUserObjectBindings__SWIG_0(swigCPtr, this), false);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Renderable__RenderSystemData_t getRenderSystemData() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Renderable__RenderSystemData_t(OgreOverlayJNI.PanelOverlayElementPtr_getRenderSystemData(swigCPtr, this), false);
  }

  public void setRenderSystemData(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Renderable__RenderSystemData_t val) {
    OgreOverlayJNI.PanelOverlayElementPtr_setRenderSystemData(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Renderable__RenderSystemData_t.getCPtr(val));
  }

}
