package com.orange.dojo.elephantcarpaccio.console;

import java.util.Optional;

public class StringInputReader {
  private final String inputMessage;
  private final Optional<String> fakeValueForTestPurpose;
  private final ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();

  public StringInputReader(String inputMessage) {
    this(inputMessage, Optional.empty());
  }

  public StringInputReader(String inputMessage, Optional<String> fakeValueForTestPurpose) {
    this.inputMessage = inputMessage;
    this.fakeValueForTestPurpose = fakeValueForTestPurpose;
  }

  public String read() {
    consoleInputOutput.display(inputMessage);
    return fakeValueForTestPurpose.isPresent() ?
            fakeValueForTestPurpose.get() :
            consoleInputOutput.readString();
  }
}
