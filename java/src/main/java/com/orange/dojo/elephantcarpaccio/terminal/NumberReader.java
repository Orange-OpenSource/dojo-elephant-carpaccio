package com.orange.dojo.elephantcarpaccio.terminal;

import java.util.InputMismatchException;
import java.util.Scanner;

class NumberReader {
  private final Scanner input;

  NumberReader(Scanner textInputScanner) {
    this.input = textInputScanner;
  }

  int readInteger() {
    try {
      return input.nextInt();
    } catch (InputMismatchException e) {
      throw new InputMismatchException("Input value is not an integer");
    }
  }
}
