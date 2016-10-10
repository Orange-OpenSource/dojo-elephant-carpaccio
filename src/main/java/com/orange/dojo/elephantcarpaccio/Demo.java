package com.orange.dojo.elephantcarpaccio;

import com.orange.dojo.elephantcarpaccio.console.ConsoleInputOutput;
import com.orange.dojo.elephantcarpaccio.console.InputNumberReader;
import com.orange.dojo.elephantcarpaccio.console.StringInputReader;

public class Demo {

  public static void main(String[] args) {
    ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();

    InputNumberReader inputNumberReader = new InputNumberReader("Enter a number:");
    double nb = inputNumberReader.read();
    consoleInputOutput.display("We have read: " + nb);

    StringInputReader stringInputReader= new StringInputReader("Enter a text:");
    String text = stringInputReader.read();
    consoleInputOutput.display("We have read: " + text);
  }
}
