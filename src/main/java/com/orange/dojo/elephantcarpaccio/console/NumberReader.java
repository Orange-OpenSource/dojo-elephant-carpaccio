package com.orange.dojo.elephantcarpaccio.console;

import java.util.InputMismatchException;
import java.util.OptionalDouble;

public class NumberReader {
  private final String inputMessage;
  private final OptionalDouble fakeValueForTestPurpose;
  private final Terminal terminal = new Terminal();

  public NumberReader(String inputMessage) {
    this(inputMessage, OptionalDouble.empty());
  }

  public NumberReader(String inputMessage, OptionalDouble fakeValueForTestPurpose) {
    this.inputMessage = inputMessage;
    this.fakeValueForTestPurpose = fakeValueForTestPurpose;
  }

  public float read() {
    return fakeValueForTestPurpose.isPresent() ? (float) fakeValueForTestPurpose.getAsDouble() : readFromTerminal(inputMessage);
  }

  private float readFromTerminal(String inputMessage) {
    do {
      try {
        terminal.display(inputMessage);
        return terminal.readNumber();
      } catch (InputMismatchException e) {
        terminal.display("WARN: You entered an invalid value");
      }
    } while (true);
  }
}
