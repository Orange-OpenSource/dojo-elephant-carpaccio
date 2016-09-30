package com.orange.dojo.elephantcarpaccio;

import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

class InputNumberReader {
  private final String inputMessage;
  private final OptionalDouble testModeExpectedInputValue;

  InputNumberReader(String inputMessage) {
    this(inputMessage, OptionalDouble.empty());
  }

  InputNumberReader(String inputMessage, OptionalDouble testModeExpectedInputValue) {
    this.inputMessage = inputMessage;
    this.testModeExpectedInputValue = testModeExpectedInputValue;
  }

  double read() {
    return testModeExpectedInputValue.isPresent() ?
            testModeExpectedInputValue.getAsDouble() :
            readFromConsole(inputMessage);
  }

  private double readFromConsole(String inputMessage) {
    do {
      try {
        System.out.println("Please enter the " + inputMessage + ":");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return input;
      } catch (InputMismatchException e) {
        System.out.println("WARN: You entered an invalid value");
      }
    } while(true);
  }
}
