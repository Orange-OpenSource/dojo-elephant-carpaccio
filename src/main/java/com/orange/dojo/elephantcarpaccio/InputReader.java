package com.orange.dojo.elephantcarpaccio;

import lombok.Value;

import java.util.OptionalInt;

class InputReader {
  private final String inputMessage;
  private final OptionalInt testModeExpectedInputValue;

  InputReader(String inputMessage) {
    this(inputMessage, OptionalInt.empty());
  }

  InputReader(String inputMessage, OptionalInt testModeExpectedInputValue) {
    this.inputMessage = inputMessage;
    this.testModeExpectedInputValue = testModeExpectedInputValue;
  }

  NumberOfItems read() {
    return testModeExpectedInputValue.isPresent() ?
            new NumberOfItems(testModeExpectedInputValue.getAsInt()) :
            null;
  }
}
