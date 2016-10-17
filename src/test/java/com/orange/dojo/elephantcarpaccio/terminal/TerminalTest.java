package com.orange.dojo.elephantcarpaccio.terminal;

import static org.fest.assertions.Assertions.assertThat;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Test;

public class TerminalTest {

  @Test
  public void I_Can_Enter_My_Name_From_The_Terminal() {
    // Given
    String expectedName = "Jeff";

    Scanner input = new Scanner(new StringReader(expectedName));
    PrintWriter output = new PrintWriter(new StringWriter());

    Terminal terminal = new Terminal(input, output);

    // When
    String name = terminal.whatIsYourName();

    // Then
    assertThat(name).isEqualTo(expectedName);
  }
  
  @Test
  public void I_Can_Enter_My_Age_From_The_Terminal() {
    // Given
    int expectedAge = 35;
    Scanner input = new Scanner(new StringReader(String.format("%d", expectedAge)));
    PrintWriter output = new PrintWriter(new StringWriter());
    
    Terminal terminal = new Terminal(input, output);
    
    // When
    int age = terminal.whatIsYourAge();
    
    // Then
    assertThat(age).isEqualTo(expectedAge);
  }
}
