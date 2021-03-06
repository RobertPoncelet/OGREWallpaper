/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class FontPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FontPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FontPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreOverlayJNI.delete_FontPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FontPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreOverlayJNI.new_FontPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public FontPtr() {
    this(OgreOverlayJNI.new_FontPtr__SWIG_1(), true);
  }

  public FontPtr(FontPtr r) {
    this(OgreOverlayJNI.new_FontPtr__SWIG_2(FontPtr.getCPtr(r), r), true);
  }

  public Font __deref__() {
    long cPtr = OgreOverlayJNI.FontPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Font(cPtr, false);
  }

  public void setType(FontType ftype) {
    OgreOverlayJNI.FontPtr_setType(swigCPtr, this, ftype.swigValue());
  }

  public void setSource(String source) {
    OgreOverlayJNI.FontPtr_setSource(swigCPtr, this, source);
  }

  public String getSource() {
    return OgreOverlayJNI.FontPtr_getSource(swigCPtr, this);
  }

  public void setCharacterSpacer(long charSpacer) {
    OgreOverlayJNI.FontPtr_setCharacterSpacer(swigCPtr, this, charSpacer);
  }

  public long getCharacterSpacer() {
    return OgreOverlayJNI.FontPtr_getCharacterSpacer(swigCPtr, this);
  }

  public void setTrueTypeSize(float ttfSize) {
    OgreOverlayJNI.FontPtr_setTrueTypeSize(swigCPtr, this, ttfSize);
  }

  public void setTrueTypeResolution(long ttfResolution) {
    OgreOverlayJNI.FontPtr_setTrueTypeResolution(swigCPtr, this, ttfResolution);
  }

  public float getTrueTypeSize() {
    return OgreOverlayJNI.FontPtr_getTrueTypeSize(swigCPtr, this);
  }

  public long getTrueTypeResolution() {
    return OgreOverlayJNI.FontPtr_getTrueTypeResolution(swigCPtr, this);
  }

  public int getTrueTypeMaxBearingY() {
    return OgreOverlayJNI.FontPtr_getTrueTypeMaxBearingY(swigCPtr, this);
  }

  public FloatRect getGlyphTexCoords(long id) {
    return new FloatRect(OgreOverlayJNI.FontPtr_getGlyphTexCoords(swigCPtr, this, id), false);
  }

  public void setGlyphTexCoords(long id, float u1, float v1, float u2, float v2, float textureAspect) {
    OgreOverlayJNI.FontPtr_setGlyphTexCoords(swigCPtr, this, id, u1, v1, u2, v2, textureAspect);
  }

  public float getGlyphAspectRatio(long id) {
    return OgreOverlayJNI.FontPtr_getGlyphAspectRatio(swigCPtr, this, id);
  }

  public void setGlyphAspectRatio(long id, float ratio) {
    OgreOverlayJNI.FontPtr_setGlyphAspectRatio(swigCPtr, this, id, ratio);
  }

  public Font.GlyphInfo getGlyphInfo(long id) {
    return new Font.GlyphInfo(OgreOverlayJNI.FontPtr_getGlyphInfo(swigCPtr, this, id), false);
  }

  public void addCodePointRange(SWIGTYPE_p_std__pairT_unsigned_int_unsigned_int_t range) {
    OgreOverlayJNI.FontPtr_addCodePointRange(swigCPtr, this, SWIGTYPE_p_std__pairT_unsigned_int_unsigned_int_t.getCPtr(range));
  }

  public void clearCodePointRanges() {
    OgreOverlayJNI.FontPtr_clearCodePointRanges(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_std__pairT_unsigned_int_unsigned_int_t_t getCodePointRangeList() {
    return new SWIGTYPE_p_std__vectorT_std__pairT_unsigned_int_unsigned_int_t_t(OgreOverlayJNI.FontPtr_getCodePointRangeList(swigCPtr, this), false);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreOverlayJNI.FontPtr_getMaterial__SWIG_0(swigCPtr, this), false);
  }

  public void setAntialiasColour(boolean enabled) {
    OgreOverlayJNI.FontPtr_setAntialiasColour(swigCPtr, this, enabled);
  }

  public boolean getAntialiasColour() {
    return OgreOverlayJNI.FontPtr_getAntialiasColour(swigCPtr, this);
  }

  public void loadResource(Resource resource) {
    OgreOverlayJNI.FontPtr_loadResource(swigCPtr, this, Resource.getCPtr(resource), resource);
  }

  public void _setMaterial(MaterialPtr mat) {
    OgreOverlayJNI.FontPtr__setMaterial(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

  public void prepare(boolean backgroundThread) {
    OgreOverlayJNI.FontPtr_prepare__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void prepare() {
    OgreOverlayJNI.FontPtr_prepare__SWIG_1(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreOverlayJNI.FontPtr_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreOverlayJNI.FontPtr_load__SWIG_1(swigCPtr, this);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreOverlayJNI.FontPtr_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreOverlayJNI.FontPtr_reload__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreOverlayJNI.FontPtr_isReloadable(swigCPtr, this);
  }

  public boolean isManuallyLoaded() {
    return OgreOverlayJNI.FontPtr_isManuallyLoaded(swigCPtr, this);
  }

  public void unload() {
    OgreOverlayJNI.FontPtr_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreOverlayJNI.FontPtr_getSize(swigCPtr, this);
  }

  public void touch() {
    OgreOverlayJNI.FontPtr_touch(swigCPtr, this);
  }

  public String getName() {
    return OgreOverlayJNI.FontPtr_getName(swigCPtr, this);
  }

  public long getHandle() {
    return OgreOverlayJNI.FontPtr_getHandle(swigCPtr, this);
  }

  public boolean isPrepared() {
    return OgreOverlayJNI.FontPtr_isPrepared(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreOverlayJNI.FontPtr_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreOverlayJNI.FontPtr_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreOverlayJNI.FontPtr_getLoadingState(swigCPtr, this));
  }

  public boolean isBackgroundLoaded() {
    return OgreOverlayJNI.FontPtr_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreOverlayJNI.FontPtr_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreOverlayJNI.FontPtr_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreOverlayJNI.FontPtr_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreOverlayJNI.FontPtr_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public String getGroup() {
    return OgreOverlayJNI.FontPtr_getGroup(swigCPtr, this);
  }

  public void changeGroupOwnership(String newGroup) {
    OgreOverlayJNI.FontPtr_changeGroupOwnership(swigCPtr, this, newGroup);
  }

  public ResourceManager getCreator() {
    long cPtr = OgreOverlayJNI.FontPtr_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public String getOrigin() {
    return OgreOverlayJNI.FontPtr_getOrigin(swigCPtr, this);
  }

  public void _notifyOrigin(String origin) {
    OgreOverlayJNI.FontPtr__notifyOrigin(swigCPtr, this, origin);
  }

  public long getStateCount() {
    return OgreOverlayJNI.FontPtr_getStateCount(swigCPtr, this);
  }

  public void _dirtyState() {
    OgreOverlayJNI.FontPtr__dirtyState(swigCPtr, this);
  }

  public void _fireLoadingComplete(boolean wasBackgroundLoaded) {
    OgreOverlayJNI.FontPtr__fireLoadingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _firePreparingComplete(boolean wasBackgroundLoaded) {
    OgreOverlayJNI.FontPtr__firePreparingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _fireUnloadingComplete() {
    OgreOverlayJNI.FontPtr__fireUnloadingComplete(swigCPtr, this);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreOverlayJNI.FontPtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t getParameters() {
    return new SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t(OgreOverlayJNI.FontPtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreOverlayJNI.FontPtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(NameValuePairList paramList) {
    OgreOverlayJNI.FontPtr_setParameterList(swigCPtr, this, NameValuePairList.getCPtr(paramList), paramList);
  }

  public String getParameter(String name) {
    return OgreOverlayJNI.FontPtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreOverlayJNI.FontPtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreOverlayJNI.FontPtr_cleanupDictionary(swigCPtr, this);
  }

  public void prepareResource(Resource resource) {
    OgreOverlayJNI.FontPtr_prepareResource(swigCPtr, this, Resource.getCPtr(resource), resource);
  }

}
