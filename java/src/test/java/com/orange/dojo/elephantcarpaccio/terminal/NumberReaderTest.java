package com.orange.dojo.elephantcarpaccio.terminal;

import java.io.StringReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

  @Test
  public void I_Read_A_Float() {
    // Given
    float expectedNumber = 14.4f;

    Scanner input = new Scanner(new StringReader(String.format("%f", expectedNumber)));
    NumberReader numberReader = new NumberReader(input);

    // When
    float aFloat = numberReader.readFloat();

    // Then
    assertThat(aFloat).isEqualTo(expectedNumber);
  }

  @Test(expected = InputMismatchException.class)
  public void when_The_Input_Is_Not_A_Number_It_Raises_An_InvalidInputException_if_we_expect_an_integer() {
    // Given
    Scanner input = new Scanner(new StringReader("f45"));
    NumberReader numberReader = new NumberReader(input);

    // When
    numberReader.readInteger();

    // Then

  }

  @Test(expected = InputMismatchException.class)
  public void when_The_Input_Is_Not_A_Number_It_Raises_An_InvalidInputException_if_we_expect_a_float() {
    // Given
    Scanner input = new Scanner(new StringReader("f45"));
    NumberReader numberReader = new NumberReader(input);

    // When
    numberReader.readFloat();

    // Then

  }

  @Test(expected = InputMismatchException.class)
  public void when_The_Input_Is_A_Float_It_Raises_An_InvalidInputException_if_we_expect_an_integer() {
    // Given
    Scanner input = new Scanner(String.format("%f", 24.5f));
    NumberReader numberReader = new NumberReader(input);

    // When
    int integer = numberReader.readInteger();

    // Then

  }
}
