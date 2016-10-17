package com.orange.dojo.elephantcarpaccio.terminal;

import java.util.Scanner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TextReader {
  private final Scanner input;

  public String readWord() {
    return input.next();
  }

}
