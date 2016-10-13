package com.orange.dojo.elephantcarpaccio;

import com.orange.dojo.elephantcarpaccio.terminal.NumberReader;
import com.orange.dojo.elephantcarpaccio.terminal.Terminal;
import com.orange.dojo.elephantcarpaccio.terminal.TextReader;

public class Demo {
  public static void main(String[] args) {
    demo();
  }

  private static void demo() {
    Terminal terminal = new Terminal();

    NumberReader numberReader = new NumberReader("Enter a number:", terminal);
    float nb = numberReader.read();
    terminal.display("We have read: " + nb);

    TextReader textReader = new TextReader("Enter a text:", terminal);
    String text = textReader.read();
    terminal.display("We have read: " + text);
  }
}
