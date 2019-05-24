package com.orange.dojo.elephantcarpaccio.terminal;

import java.util.Scanner;

class TextReader {
  private final Scanner input;

  TextReader(Scanner textInputScanner) {
    this.input = textInputScanner;
  }

  String readWord() {
    return input.next();
  }
}
