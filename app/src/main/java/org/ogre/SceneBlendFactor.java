/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum SceneBlendFactor {
  SBF_ONE,
  SBF_ZERO,
  SBF_DEST_COLOUR,
  SBF_SOURCE_COLOUR,
  SBF_ONE_MINUS_DEST_COLOUR,
  SBF_ONE_MINUS_SOURCE_COLOUR,
  SBF_DEST_ALPHA,
  SBF_SOURCE_ALPHA,
  SBF_ONE_MINUS_DEST_ALPHA,
  SBF_ONE_MINUS_SOURCE_ALPHA;

  public final int swigValue() {
    return swigValue;
  }

  public static SceneBlendFactor swigToEnum(int swigValue) {
    SceneBlendFactor[] swigValues = SceneBlendFactor.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (SceneBlendFactor swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + SceneBlendFactor.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private SceneBlendFactor() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private SceneBlendFactor(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private SceneBlendFactor(SceneBlendFactor swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

