package com.orange.dojo.elephantcarpaccio;

import java.util.OptionalDouble;
import java.util.Scanner;

class InputReader {
  private final String inputMessage;
  private final OptionalDouble testModeExpectedInputValue;

  InputReader(String inputMessage) {
    this(inputMessage, OptionalDouble.empty());
  }

  InputReader(String inputMessage, OptionalDouble testModeExpectedInputValue) {
    this.inputMessage = inputMessage;
    this.testModeExpectedInputValue = testModeExpectedInputValue;
  }

  double read() {
    return testModeExpectedInputValue.isPresent() ?
            testModeExpectedInputValue.getAsDouble() :
            readFromConsole(inputMessage);
  }

  private double readFromConsole(String inputMessage) {
    System.out.println("Please enter the " + inputMessage + ":");
    Scanner scanner = new Scanner(System.in);
    double input =  scanner.nextDouble();
    return input;
  }
}
