/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class MaterialPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MaterialPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MaterialPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MaterialPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MaterialPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_MaterialPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public MaterialPtr() {
    this(OgreJNI.new_MaterialPtr__SWIG_1(), true);
  }

  public MaterialPtr(MaterialPtr r) {
    this(OgreJNI.new_MaterialPtr__SWIG_2(MaterialPtr.getCPtr(r), r), true);
  }

  public Material __deref__() {
    long cPtr = OgreJNI.MaterialPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Material(cPtr, false);
  }

  public boolean isTransparent() {
    return OgreJNI.MaterialPtr_isTransparent(swigCPtr, this);
  }

  public void setReceiveShadows(boolean enabled) {
    OgreJNI.MaterialPtr_setReceiveShadows(swigCPtr, this, enabled);
  }

  public boolean getReceiveShadows() {
    return OgreJNI.MaterialPtr_getReceiveShadows(swigCPtr, this);
  }

  public void setTransparencyCastsShadows(boolean enabled) {
    OgreJNI.MaterialPtr_setTransparencyCastsShadows(swigCPtr, this, enabled);
  }

  public boolean getTransparencyCastsShadows() {
    return OgreJNI.MaterialPtr_getTransparencyCastsShadows(swigCPtr, this);
  }

  public Technique createTechnique() {
    long cPtr = OgreJNI.MaterialPtr_createTechnique(swigCPtr, this);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public Technique getTechnique(int index) {
    long cPtr = OgreJNI.MaterialPtr_getTechnique__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public Technique getTechnique(String name) {
    long cPtr = OgreJNI.MaterialPtr_getTechnique__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public int getNumTechniques() {
    return OgreJNI.MaterialPtr_getNumTechniques(swigCPtr, this);
  }

  public void removeTechnique(int index) {
    OgreJNI.MaterialPtr_removeTechnique(swigCPtr, this, index);
  }

  public void removeAllTechniques() {
    OgreJNI.MaterialPtr_removeAllTechniques(swigCPtr, this);
  }

  public Techniques getTechniques() {
    return new Techniques(OgreJNI.MaterialPtr_getTechniques(swigCPtr, this), false);
  }

  public Techniques getSupportedTechniques() {
    return new Techniques(OgreJNI.MaterialPtr_getSupportedTechniques(swigCPtr, this), false);
  }

  public String getUnsupportedTechniquesExplanation() {
    return OgreJNI.MaterialPtr_getUnsupportedTechniquesExplanation(swigCPtr, this);
  }

  public int getNumLodLevels(int schemeIndex) {
    return OgreJNI.MaterialPtr_getNumLodLevels__SWIG_0(swigCPtr, this, schemeIndex);
  }

  public int getNumLodLevels(String schemeName) {
    return OgreJNI.MaterialPtr_getNumLodLevels__SWIG_1(swigCPtr, this, schemeName);
  }

  public Technique getBestTechnique(int lodIndex, Renderable rend) {
    long cPtr = OgreJNI.MaterialPtr_getBestTechnique__SWIG_0(swigCPtr, this, lodIndex, Renderable.getCPtr(rend), rend);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public Technique getBestTechnique(int lodIndex) {
    long cPtr = OgreJNI.MaterialPtr_getBestTechnique__SWIG_1(swigCPtr, this, lodIndex);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public Technique getBestTechnique() {
    long cPtr = OgreJNI.MaterialPtr_getBestTechnique__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public MaterialPtr clone(String newName, boolean changeGroup, String newGroup) {
    return new MaterialPtr(OgreJNI.MaterialPtr_clone__SWIG_0(swigCPtr, this, newName, changeGroup, newGroup), true);
  }

  public MaterialPtr clone(String newName, boolean changeGroup) {
    return new MaterialPtr(OgreJNI.MaterialPtr_clone__SWIG_1(swigCPtr, this, newName, changeGroup), true);
  }

  public MaterialPtr clone(String newName) {
    return new MaterialPtr(OgreJNI.MaterialPtr_clone__SWIG_2(swigCPtr, this, newName), true);
  }

  public void copyDetailsTo(MaterialPtr mat) {
    OgreJNI.MaterialPtr_copyDetailsTo(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

  public void compile(boolean autoManageTextureUnits) {
    OgreJNI.MaterialPtr_compile__SWIG_0(swigCPtr, this, autoManageTextureUnits);
  }

  public void compile() {
    OgreJNI.MaterialPtr_compile__SWIG_1(swigCPtr, this);
  }

  public void setPointSize(float ps) {
    OgreJNI.MaterialPtr_setPointSize(swigCPtr, this, ps);
  }

  public void setAmbient(float red, float green, float blue) {
    OgreJNI.MaterialPtr_setAmbient__SWIG_0(swigCPtr, this, red, green, blue);
  }

  public void setAmbient(ColourValue ambient) {
    OgreJNI.MaterialPtr_setAmbient__SWIG_1(swigCPtr, this, ColourValue.getCPtr(ambient), ambient);
  }

  public void setDiffuse(float red, float green, float blue, float alpha) {
    OgreJNI.MaterialPtr_setDiffuse__SWIG_0(swigCPtr, this, red, green, blue, alpha);
  }

  public void setDiffuse(ColourValue diffuse) {
    OgreJNI.MaterialPtr_setDiffuse__SWIG_1(swigCPtr, this, ColourValue.getCPtr(diffuse), diffuse);
  }

  public void setSpecular(float red, float green, float blue, float alpha) {
    OgreJNI.MaterialPtr_setSpecular__SWIG_0(swigCPtr, this, red, green, blue, alpha);
  }

  public void setSpecular(ColourValue specular) {
    OgreJNI.MaterialPtr_setSpecular__SWIG_1(swigCPtr, this, ColourValue.getCPtr(specular), specular);
  }

  public void setShininess(float val) {
    OgreJNI.MaterialPtr_setShininess(swigCPtr, this, val);
  }

  public void setSelfIllumination(float red, float green, float blue) {
    OgreJNI.MaterialPtr_setSelfIllumination__SWIG_0(swigCPtr, this, red, green, blue);
  }

  public void setSelfIllumination(ColourValue selfIllum) {
    OgreJNI.MaterialPtr_setSelfIllumination__SWIG_1(swigCPtr, this, ColourValue.getCPtr(selfIllum), selfIllum);
  }

  public void setDepthCheckEnabled(boolean enabled) {
    OgreJNI.MaterialPtr_setDepthCheckEnabled(swigCPtr, this, enabled);
  }

  public void setDepthWriteEnabled(boolean enabled) {
    OgreJNI.MaterialPtr_setDepthWriteEnabled(swigCPtr, this, enabled);
  }

  public void setDepthFunction(CompareFunction func) {
    OgreJNI.MaterialPtr_setDepthFunction(swigCPtr, this, func.swigValue());
  }

  public void setColourWriteEnabled(boolean enabled) {
    OgreJNI.MaterialPtr_setColourWriteEnabled__SWIG_0(swigCPtr, this, enabled);
  }

  public void setColourWriteEnabled(boolean red, boolean green, boolean blue, boolean alpha) {
    OgreJNI.MaterialPtr_setColourWriteEnabled__SWIG_1(swigCPtr, this, red, green, blue, alpha);
  }

  public void setCullingMode(CullingMode mode) {
    OgreJNI.MaterialPtr_setCullingMode(swigCPtr, this, mode.swigValue());
  }

  public void setManualCullingMode(ManualCullingMode mode) {
    OgreJNI.MaterialPtr_setManualCullingMode(swigCPtr, this, mode.swigValue());
  }

  public void setLightingEnabled(boolean enabled) {
    OgreJNI.MaterialPtr_setLightingEnabled(swigCPtr, this, enabled);
  }

  public void setShadingMode(ShadeOptions mode) {
    OgreJNI.MaterialPtr_setShadingMode(swigCPtr, this, mode.swigValue());
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour, float expDensity, float linearStart, float linearEnd) {
    OgreJNI.MaterialPtr_setFog__SWIG_0(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour, expDensity, linearStart, linearEnd);
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour, float expDensity, float linearStart) {
    OgreJNI.MaterialPtr_setFog__SWIG_1(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour, expDensity, linearStart);
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour, float expDensity) {
    OgreJNI.MaterialPtr_setFog__SWIG_2(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour, expDensity);
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour) {
    OgreJNI.MaterialPtr_setFog__SWIG_3(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour);
  }

  public void setFog(boolean overrideScene, FogMode mode) {
    OgreJNI.MaterialPtr_setFog__SWIG_4(swigCPtr, this, overrideScene, mode.swigValue());
  }

  public void setFog(boolean overrideScene) {
    OgreJNI.MaterialPtr_setFog__SWIG_5(swigCPtr, this, overrideScene);
  }

  public void setDepthBias(float constantBias, float slopeScaleBias) {
    OgreJNI.MaterialPtr_setDepthBias(swigCPtr, this, constantBias, slopeScaleBias);
  }

  public void setTextureFiltering(TextureFilterOptions filterType) {
    OgreJNI.MaterialPtr_setTextureFiltering(swigCPtr, this, filterType.swigValue());
  }

  public void setTextureAnisotropy(int maxAniso) {
    OgreJNI.MaterialPtr_setTextureAnisotropy(swigCPtr, this, maxAniso);
  }

  public void setSceneBlending(SceneBlendType sbt) {
    OgreJNI.MaterialPtr_setSceneBlending__SWIG_0(swigCPtr, this, sbt.swigValue());
  }

  public void setSceneBlending(SceneBlendFactor sourceFactor, SceneBlendFactor destFactor) {
    OgreJNI.MaterialPtr_setSceneBlending__SWIG_1(swigCPtr, this, sourceFactor.swigValue(), destFactor.swigValue());
  }

  public void setSeparateSceneBlending(SceneBlendType sbt, SceneBlendType sbta) {
    OgreJNI.MaterialPtr_setSeparateSceneBlending__SWIG_0(swigCPtr, this, sbt.swigValue(), sbta.swigValue());
  }

  public void setSeparateSceneBlending(SceneBlendFactor sourceFactor, SceneBlendFactor destFactor, SceneBlendFactor sourceFactorAlpha, SceneBlendFactor destFactorAlpha) {
    OgreJNI.MaterialPtr_setSeparateSceneBlending__SWIG_1(swigCPtr, this, sourceFactor.swigValue(), destFactor.swigValue(), sourceFactorAlpha.swigValue(), destFactorAlpha.swigValue());
  }

  public void _notifyNeedsRecompile() {
    OgreJNI.MaterialPtr__notifyNeedsRecompile(swigCPtr, this);
  }

  public void setLodLevels(SWIGTYPE_p_std__vectorT_float_t lodValues) {
    OgreJNI.MaterialPtr_setLodLevels(swigCPtr, this, SWIGTYPE_p_std__vectorT_float_t.getCPtr(lodValues));
  }

  public SWIGTYPE_p_std__vectorT_float_t getLodValues() {
    return new SWIGTYPE_p_std__vectorT_float_t(OgreJNI.MaterialPtr_getLodValues(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorT_float_t getUserLodValues() {
    return new SWIGTYPE_p_std__vectorT_float_t(OgreJNI.MaterialPtr_getUserLodValues(swigCPtr, this), false);
  }

  public int getLodIndex(float value) {
    return OgreJNI.MaterialPtr_getLodIndex(swigCPtr, this, value);
  }

  public LodStrategy getLodStrategy() {
    long cPtr = OgreJNI.MaterialPtr_getLodStrategy(swigCPtr, this);
    return (cPtr == 0) ? null : new LodStrategy(cPtr, false);
  }

  public void setLodStrategy(LodStrategy lodStrategy) {
    OgreJNI.MaterialPtr_setLodStrategy(swigCPtr, this, LodStrategy.getCPtr(lodStrategy), lodStrategy);
  }

  public void touch() {
    OgreJNI.MaterialPtr_touch(swigCPtr, this);
  }

  public boolean applyTextureAliases(NameValuePairList aliasList, boolean apply) {
    return OgreJNI.MaterialPtr_applyTextureAliases__SWIG_0(swigCPtr, this, NameValuePairList.getCPtr(aliasList), aliasList, apply);
  }

  public boolean applyTextureAliases(NameValuePairList aliasList) {
    return OgreJNI.MaterialPtr_applyTextureAliases__SWIG_1(swigCPtr, this, NameValuePairList.getCPtr(aliasList), aliasList);
  }

  public boolean getCompilationRequired() {
    return OgreJNI.MaterialPtr_getCompilationRequired(swigCPtr, this);
  }

  public void prepare(boolean backgroundThread) {
    OgreJNI.MaterialPtr_prepare__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void prepare() {
    OgreJNI.MaterialPtr_prepare__SWIG_1(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreJNI.MaterialPtr_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreJNI.MaterialPtr_load__SWIG_1(swigCPtr, this);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.MaterialPtr_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.MaterialPtr_reload__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreJNI.MaterialPtr_isReloadable(swigCPtr, this);
  }

  public boolean isManuallyLoaded() {
    return OgreJNI.MaterialPtr_isManuallyLoaded(swigCPtr, this);
  }

  public void unload() {
    OgreJNI.MaterialPtr_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreJNI.MaterialPtr_getSize(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.MaterialPtr_getName(swigCPtr, this);
  }

  public long getHandle() {
    return OgreJNI.MaterialPtr_getHandle(swigCPtr, this);
  }

  public boolean isPrepared() {
    return OgreJNI.MaterialPtr_isPrepared(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.MaterialPtr_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreJNI.MaterialPtr_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreJNI.MaterialPtr_getLoadingState(swigCPtr, this));
  }

  public boolean isBackgroundLoaded() {
    return OgreJNI.MaterialPtr_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreJNI.MaterialPtr_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreJNI.MaterialPtr_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreJNI.MaterialPtr_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreJNI.MaterialPtr_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public String getGroup() {
    return OgreJNI.MaterialPtr_getGroup(swigCPtr, this);
  }

  public void changeGroupOwnership(String newGroup) {
    OgreJNI.MaterialPtr_changeGroupOwnership(swigCPtr, this, newGroup);
  }

  public ResourceManager getCreator() {
    long cPtr = OgreJNI.MaterialPtr_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public String getOrigin() {
    return OgreJNI.MaterialPtr_getOrigin(swigCPtr, this);
  }

  public void _notifyOrigin(String origin) {
    OgreJNI.MaterialPtr__notifyOrigin(swigCPtr, this, origin);
  }

  public long getStateCount() {
    return OgreJNI.MaterialPtr_getStateCount(swigCPtr, this);
  }

  public void _dirtyState() {
    OgreJNI.MaterialPtr__dirtyState(swigCPtr, this);
  }

  public void _fireLoadingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.MaterialPtr__fireLoadingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _firePreparingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.MaterialPtr__firePreparingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _fireUnloadingComplete() {
    OgreJNI.MaterialPtr__fireUnloadingComplete(swigCPtr, this);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreJNI.MaterialPtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t getParameters() {
    return new SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t(OgreJNI.MaterialPtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreJNI.MaterialPtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(NameValuePairList paramList) {
    OgreJNI.MaterialPtr_setParameterList(swigCPtr, this, NameValuePairList.getCPtr(paramList), paramList);
  }

  public String getParameter(String name) {
    return OgreJNI.MaterialPtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreJNI.MaterialPtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreJNI.MaterialPtr_cleanupDictionary(swigCPtr, this);
  }

}
