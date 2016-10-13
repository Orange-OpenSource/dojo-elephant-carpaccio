package com.orange.dojo.elephantcarpaccio.terminal;

import java.io.PrintWriter;
import java.util.Scanner;

public class Terminal {
  private final Scanner scanner = new Scanner(System.in);
  private final PrintWriter printWriter = new PrintWriter(System.out, true);

  public void display(String message) {
    printWriter.println(message);
  }

  String readText() {
    return scanner.next();
  }

  float readNumber() {
    return scanner.nextFloat();
  }
}
