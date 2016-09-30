package com.orange.dojo.elephantcarpaccio;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Value
@Accessors(fluent = true)
class StateCode {
  private static final String[] SUPPORTED_STATES = {
    "UT"
  };
  private static final float[] STATES_TAXES = {
    0.0685f
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
