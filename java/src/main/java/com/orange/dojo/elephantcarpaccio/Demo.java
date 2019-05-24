package com.orange.dojo.elephantcarpaccio;

import com.orange.dojo.elephantcarpaccio.terminal.Terminal;

public class Demo {
  public static void main(String[] args) {
    demo();
  }

  private static void demo() {
    Terminal terminal = new Terminal();
    
    String name = terminal.whatIsYourName();
    terminal.display("Your name is " + name);

    int age = terminal.whatIsYourAge();
    terminal.display("Your age is " + age);
  }
}
