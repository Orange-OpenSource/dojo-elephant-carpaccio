package com.orange.dojo.elephantcarpaccio.console;

import java.util.Scanner;

public class ConsoleInputOutput {

  public void display(String message) {
    System.out.println(message);
  }

  String readString() {
    Scanner scanner = new Scanner(System.in);
    return scanner.next();
  }

  double readDouble() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }
}
