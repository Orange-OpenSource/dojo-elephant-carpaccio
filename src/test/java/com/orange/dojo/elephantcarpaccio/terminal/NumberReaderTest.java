package com.orange.dojo.elephantcarpaccio.terminal;

import static org.fest.assertions.Assertions.assertThat;

import java.io.StringReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

public class NumberReaderTest {

  @Test
  public void I_Read_An_Integer() {
    // Given
    int expectedNumber = 14;

    Scanner input = new Scanner(new StringReader(String.format("%d", expectedNumber)));
    NumberReader numberReader = new NumberReader(input);

    // When
    int integer = numberReader.readInteger();

    // Then
    assertThat(integer).isEqualTo(expectedNumber);
  }
  
  @Test(expected = InputMismatchException.class)
  public void when_The_Input_Is_Not_A_Number_It_Raises_An_InvalidInputException() {
    // Given
    Scanner input = new Scanner(new StringReader("f45"));
    NumberReader numberReader = new NumberReader(input);
    
    // When
    int integer = numberReader.readInteger();
    
    // Then
   
  }
  
  @Test(expected = InputMismatchException.class)
  public void when_The_Input_Is_A_Float_It_Raises_An_InvalidInputException() {
    // Given
    Scanner input = new Scanner(String.format("%f", 24.5f));
    NumberReader numberReader = new NumberReader(input);
    
    // When
    int integer = numberReader.readInteger();
    
    // Then
    
  }
}
