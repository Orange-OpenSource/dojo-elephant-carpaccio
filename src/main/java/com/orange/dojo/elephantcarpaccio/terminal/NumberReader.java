package com.orange.dojo.elephantcarpaccio.terminal;

import java.util.InputMismatchException;
import java.util.Scanner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NumberReader {
  private final Scanner input;

  public int readInteger() {
    try {
      return input.nextInt();
    } catch (InputMismatchException e) {
      throw new InputMismatchException("Input value is not an integer");
    }
  }

}
