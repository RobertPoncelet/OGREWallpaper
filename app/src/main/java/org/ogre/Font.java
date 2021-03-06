/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Font extends Resource {
  private transient long swigCPtr;

  protected Font(long cPtr, boolean cMemoryOwn) {
    super(OgreOverlayJNI.Font_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Font obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreOverlayJNI.delete_Font(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static public class GlyphInfo {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected GlyphInfo(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(GlyphInfo obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreOverlayJNI.delete_Font_GlyphInfo(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCodePoint(long value) {
      OgreOverlayJNI.Font_GlyphInfo_codePoint_set(swigCPtr, this, value);
    }
  
    public long getCodePoint() {
      return OgreOverlayJNI.Font_GlyphInfo_codePoint_get(swigCPtr, this);
    }
  
    public void setUvRect(FloatRect value) {
      OgreOverlayJNI.Font_GlyphInfo_uvRect_set(swigCPtr, this, FloatRect.getCPtr(value), value);
    }
  
    public FloatRect getUvRect() {
      long cPtr = OgreOverlayJNI.Font_GlyphInfo_uvRect_get(swigCPtr, this);
      return (cPtr == 0) ? null : new FloatRect(cPtr, false);
    }
  
    public void setAspectRatio(float value) {
      OgreOverlayJNI.Font_GlyphInfo_aspectRatio_set(swigCPtr, this, value);
    }
  
    public float getAspectRatio() {
      return OgreOverlayJNI.Font_GlyphInfo_aspectRatio_get(swigCPtr, this);
    }
  
    public GlyphInfo(long id, FloatRect rect, float aspect) {
      this(OgreOverlayJNI.new_Font_GlyphInfo(id, FloatRect.getCPtr(rect), rect, aspect), true);
    }
  
  }

  public Font(ResourceManager creator, String name, long handle, String group, boolean isManual, ManualResourceLoader loader) {
    this(OgreOverlayJNI.new_Font__SWIG_0(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public Font(ResourceManager creator, String name, long handle, String group, boolean isManual) {
    this(OgreOverlayJNI.new_Font__SWIG_1(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual), true);
  }

  public Font(ResourceManager creator, String name, long handle, String group) {
    this(OgreOverlayJNI.new_Font__SWIG_2(ResourceManager.getCPtr(creator), creator, name, handle, group), true);
  }

  public void setType(FontType ftype) {
    OgreOverlayJNI.Font_setType(swigCPtr, this, ftype.swigValue());
  }

  public void setSource(String source) {
    OgreOverlayJNI.Font_setSource(swigCPtr, this, source);
  }

  public String getSource() {
    return OgreOverlayJNI.Font_getSource(swigCPtr, this);
  }

  public void setCharacterSpacer(long charSpacer) {
    OgreOverlayJNI.Font_setCharacterSpacer(swigCPtr, this, charSpacer);
  }

  public long getCharacterSpacer() {
    return OgreOverlayJNI.Font_getCharacterSpacer(swigCPtr, this);
  }

  public void setTrueTypeSize(float ttfSize) {
    OgreOverlayJNI.Font_setTrueTypeSize(swigCPtr, this, ttfSize);
  }

  public void setTrueTypeResolution(long ttfResolution) {
    OgreOverlayJNI.Font_setTrueTypeResolution(swigCPtr, this, ttfResolution);
  }

  public float getTrueTypeSize() {
    return OgreOverlayJNI.Font_getTrueTypeSize(swigCPtr, this);
  }

  public long getTrueTypeResolution() {
    return OgreOverlayJNI.Font_getTrueTypeResolution(swigCPtr, this);
  }

  public int getTrueTypeMaxBearingY() {
    return OgreOverlayJNI.Font_getTrueTypeMaxBearingY(swigCPtr, this);
  }

  public FloatRect getGlyphTexCoords(long id) {
    return new FloatRect(OgreOverlayJNI.Font_getGlyphTexCoords(swigCPtr, this, id), false);
  }

  public void setGlyphTexCoords(long id, float u1, float v1, float u2, float v2, float textureAspect) {
    OgreOverlayJNI.Font_setGlyphTexCoords(swigCPtr, this, id, u1, v1, u2, v2, textureAspect);
  }

  public float getGlyphAspectRatio(long id) {
    return OgreOverlayJNI.Font_getGlyphAspectRatio(swigCPtr, this, id);
  }

  public void setGlyphAspectRatio(long id, float ratio) {
    OgreOverlayJNI.Font_setGlyphAspectRatio(swigCPtr, this, id, ratio);
  }

  public Font.GlyphInfo getGlyphInfo(long id) {
    return new Font.GlyphInfo(OgreOverlayJNI.Font_getGlyphInfo(swigCPtr, this, id), false);
  }

  public void addCodePointRange(SWIGTYPE_p_std__pairT_unsigned_int_unsigned_int_t range) {
    OgreOverlayJNI.Font_addCodePointRange(swigCPtr, this, SWIGTYPE_p_std__pairT_unsigned_int_unsigned_int_t.getCPtr(range));
  }

  public void clearCodePointRanges() {
    OgreOverlayJNI.Font_clearCodePointRanges(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_std__pairT_unsigned_int_unsigned_int_t_t getCodePointRangeList() {
    return new SWIGTYPE_p_std__vectorT_std__pairT_unsigned_int_unsigned_int_t_t(OgreOverlayJNI.Font_getCodePointRangeList(swigCPtr, this), false);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreOverlayJNI.Font_getMaterial__SWIG_0(swigCPtr, this), false);
  }

  public void setAntialiasColour(boolean enabled) {
    OgreOverlayJNI.Font_setAntialiasColour(swigCPtr, this, enabled);
  }

  public boolean getAntialiasColour() {
    return OgreOverlayJNI.Font_getAntialiasColour(swigCPtr, this);
  }

  public void loadResource(Resource resource) {
    OgreOverlayJNI.Font_loadResource(swigCPtr, this, Resource.getCPtr(resource), resource);
  }

  public void _setMaterial(MaterialPtr mat) {
    OgreOverlayJNI.Font__setMaterial(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

}
