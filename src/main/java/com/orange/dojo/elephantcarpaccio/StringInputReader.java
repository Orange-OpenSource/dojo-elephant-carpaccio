package com.orange.dojo.elephantcarpaccio;

import java.util.Optional;
import java.util.Scanner;

class StringInputReader {
  private final String inputMessage;
  private final Optional<String> testExpectedString;

  StringInputReader(String inputMessage) {
    this(inputMessage, Optional.empty());
  }

  StringInputReader(String inputMessage, Optional<String> testExpectedString) {
    this.inputMessage = inputMessage;
    this.testExpectedString = testExpectedString;
  }

  String read() {
    System.out.println("Please enter the " + inputMessage + ":");
    return testExpectedString.isPresent() ?
            testExpectedString.get() :
            readFromConsole();
  }

  private String readFromConsole() {
    Scanner scanner = new Scanner(System.in);
    return scanner.next();
  }
}
