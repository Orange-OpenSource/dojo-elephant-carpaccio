package com.orange.dojo.elephantcarpaccio.terminal;

import java.io.PrintWriter;
import java.util.Scanner;

public class Terminal {
  private PrintWriter output;
  private NumberReader numberReader;
  private TextReader textReader;

  public Terminal() {
    this(new Scanner(System.in), new PrintWriter(System.out, true));
  }

  Terminal(Scanner input, PrintWriter output) {
    // To change the local
    //input.useLocale(Locale.US);
    this.output = output;
    this.numberReader = new NumberReader(input);
    this.textReader = new TextReader(input);
  }

  public int whatIsYourAge() {
    display("What is your age? :");
    return numberReader.readInteger();
  }

  public String whatIsYourName() {
    display("What is your name? :");
    return textReader.readWord();
  }

  public void display(String message) {
    output.println(message);
  }
}
