package com.orange.dojo.elephantcarpaccio;

import com.orange.dojo.elephantcarpaccio.console.NumberReader;
import com.orange.dojo.elephantcarpaccio.console.TextReader;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;

import static org.fest.assertions.Assertions.assertThat;

public class ReadTest {

  @Test
  public void we_can_read_a_number_from_console() {
    // Given
    float expected = 2.5f;
    NumberReader input = new NumberReader("Enter number:", OptionalDouble.of(expected));

    // When
    float readInput = input.read();

    // Then
    assertThat(readInput).isEqualTo(expected);
  }

  @Test
  public void we_can_read_a_string_from_console() {
    // Given
    String expected = "hello";
    TextReader input = new TextReader("Enter string:", Optional.of(expected));

    // When
    String readInput = input.read();

    // Then
    assertThat(readInput).isEqualTo(expected);
  }
}
