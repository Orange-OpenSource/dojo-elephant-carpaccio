package com.orange.dojo.elephantcarpaccio;

import com.orange.dojo.elephantcarpaccio.console.Terminal;
import com.orange.dojo.elephantcarpaccio.console.NumberReader;
import com.orange.dojo.elephantcarpaccio.console.TextReader;

public class Demo {

  public static void main(String[] args) {
    Terminal terminal = new Terminal();

    NumberReader numberReader = new NumberReader("Enter a number:");
    double nb = numberReader.read();
    terminal.display("We have read: " + nb);

    TextReader textReader = new TextReader("Enter a text:");
    String text = textReader.read();
    terminal.display("We have read: " + text);
  }
}
