package com.orange.dojo.elephantcarpaccio.terminal;

import lombok.RequiredArgsConstructor;

import java.util.InputMismatchException;

@RequiredArgsConstructor
public class NumberReader {
  private final String inputMessage;
  private final Terminal terminal;

  public float read() {
    terminal.display(inputMessage);
    try {
      return terminal.readNumber();
    } catch (InputMismatchException e) {
      throw new InvalidInputException("Input value is not a number");
    }
  }
}
