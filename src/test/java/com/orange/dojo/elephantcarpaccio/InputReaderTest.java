package com.orange.dojo.elephantcarpaccio;

import com.orange.dojo.elephantcarpaccio.console.InputNumberReader;
import com.orange.dojo.elephantcarpaccio.console.StringInputReader;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;

import static org.fest.assertions.Assertions.assertThat;

public class InputReaderTest {

  @Test
  public void we_can_read_a_number_from_console() {
    // given
    double expected = 2.5f;
    InputNumberReader input =
            new InputNumberReader("Enter number:", OptionalDouble.of(expected));
    // when
    double readInput = input.read();

    // then
    assertThat(readInput).isEqualTo(expected);
  }

  @Test
  public void we_can_read_a_string_from_console() {
    // given
    String expected = "hello";
    StringInputReader input =
            new StringInputReader("Enter string:", Optional.of(expected));
    // when
    String readInput = input.read();

    // then
    assertThat(readInput).isEqualTo(expected);
  }
}
