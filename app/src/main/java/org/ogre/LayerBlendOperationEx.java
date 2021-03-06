/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum LayerBlendOperationEx {
  LBX_SOURCE1,
  LBX_SOURCE2,
  LBX_MODULATE,
  LBX_MODULATE_X2,
  LBX_MODULATE_X4,
  LBX_ADD,
  LBX_ADD_SIGNED,
  LBX_ADD_SMOOTH,
  LBX_SUBTRACT,
  LBX_BLEND_DIFFUSE_ALPHA,
  LBX_BLEND_TEXTURE_ALPHA,
  LBX_BLEND_CURRENT_ALPHA,
  LBX_BLEND_MANUAL,
  LBX_DOTPRODUCT,
  LBX_BLEND_DIFFUSE_COLOUR;

  public final int swigValue() {
    return swigValue;
  }

  public static LayerBlendOperationEx swigToEnum(int swigValue) {
    LayerBlendOperationEx[] swigValues = LayerBlendOperationEx.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (LayerBlendOperationEx swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + LayerBlendOperationEx.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private LayerBlendOperationEx() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private LayerBlendOperationEx(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private LayerBlendOperationEx(LayerBlendOperationEx swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

