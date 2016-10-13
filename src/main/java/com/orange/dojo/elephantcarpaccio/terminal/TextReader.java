package com.orange.dojo.elephantcarpaccio.terminal;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TextReader {
  private final String inputMessage;
  private final Terminal terminal;

  public String read() {
    terminal.display(inputMessage);
    return terminal.readText();
  }
}
