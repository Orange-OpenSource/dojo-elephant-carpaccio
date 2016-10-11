package com.orange.dojo.elephantcarpaccio.console;

import java.util.InputMismatchException;
import java.util.OptionalDouble;

public class InputNumberReader {
  private final String inputMessage;
  private final OptionalDouble fakeValueForTestPurpose;
  private final ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();

  public InputNumberReader(String inputMessage) {
    this(inputMessage, OptionalDouble.empty());
  }

  public InputNumberReader(String inputMessage, OptionalDouble fakeValueForTestPurpose) {
    this.inputMessage = inputMessage;
    this.fakeValueForTestPurpose = fakeValueForTestPurpose;
  }

  public double read() {
    return fakeValueForTestPurpose.isPresent() ? fakeValueForTestPurpose.getAsDouble() : readFromConsole(inputMessage);
  }

  private double readFromConsole(String inputMessage) {
    do {
      try {
        consoleInputOutput.display(inputMessage);
        return consoleInputOutput.readDouble();
      } catch (InputMismatchException e) {
        consoleInputOutput.display("WARN: You entered an invalid value");
      }
    } while (true);
  }
}
