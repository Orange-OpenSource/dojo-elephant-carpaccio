package com.orange.dojo.elephantcarpaccio.terminal;

import java.util.Scanner;

public class TextReader {
  private final Scanner input;

  public TextReader(Scanner textInputScanner) {
    this.input = textInputScanner;
  }

  public String readWord() {
    return input.next();
  }
}
