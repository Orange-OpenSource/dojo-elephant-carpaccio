package com.orange.dojo.elephantcarpaccio;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Value
@Accessors(fluent = true)
class StateCode {
  private static final String[] SUPPORTED_STATES = {
    "UT", "NV", "TX", "AL", "CA"
  };
  private static final float[] STATES_TAXES = {
    0.0685f, 0.08f, 0.0625f, 0.04f, 0.0825f
  };

  String val;

  boolean isSupported() {
    return Arrays.asList(SUPPORTED_STATES).contains(val);
  }

  float tax() {
    int stateIndex = Arrays.asList(SUPPORTED_STATES).indexOf(val);
    return STATES_TAXES[stateIndex];
  }
}
