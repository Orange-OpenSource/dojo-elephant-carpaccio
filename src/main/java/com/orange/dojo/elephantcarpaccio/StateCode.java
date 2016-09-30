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

  String val;

  public boolean isSupported() {
    return Arrays.asList(SUPPORTED_STATES).contains(val);
  }
}
