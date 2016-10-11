package com.orange.dojo.elephantcarpaccio.console;

import java.util.Optional;

public class TextReader {
  private final String inputMessage;
  private final Optional<String> fakeValueForTestPurpose;
  private final Terminal terminal = new Terminal();

  public TextReader(String inputMessage) {
    this(inputMessage, Optional.empty());
  }

  public TextReader(String inputMessage, Optional<String> fakeValueForTestPurpose) {
    this.inputMessage = inputMessage;
    this.fakeValueForTestPurpose = fakeValueForTestPurpose;
  }

  public String read() {
    terminal.display(inputMessage);
    return fakeValueForTestPurpose.isPresent() ? fakeValueForTestPurpose.get() : terminal.readText();
  }
}
