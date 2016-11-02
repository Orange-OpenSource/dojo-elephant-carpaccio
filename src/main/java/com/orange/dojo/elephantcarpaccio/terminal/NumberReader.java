package com.orange.dojo.elephantcarpaccio.terminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberReader {
  private final Scanner input;

  public NumberReader(Scanner textInputScanner) {
    this.input = textInputScanner;
  }

  public int readInteger() {
    try {
      return input.nextInt();
    } catch (InputMismatchException e) {
      throw new InputMismatchException("Input value is not an integer");
    }
  }

}
