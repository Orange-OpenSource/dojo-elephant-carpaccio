package com.orange.dojo.elephantcarpaccio.terminal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.InputMismatchException;

import static org.fest.assertions.Assertions.assertThat;

public class ReadTest {
  Terminal terminal;

  @Before
  public void setup() {
    terminal = Mockito.mock(Terminal.class);
  }

  @Test
  public void we_can_read_a_number_from_terminal() {
    // Given
    float expected = 2.5f;
    Mockito.when(terminal.readNumber()).thenReturn(expected);
    NumberReader numberReader = new NumberReader("Enter number:", terminal);

    // When
    float readNumber = numberReader.read();

    // Then
    assertThat(readNumber).isEqualTo(expected);
  }

  @Test(expected = InvalidInputException.class)
  public void if_we_do_not_input_a_number_it_will_raise_an_invalid_input_exception() {
    Mockito.when(terminal.readNumber()).thenThrow(InputMismatchException.class);
    NumberReader numberReader = new NumberReader("Enter number:", terminal);

    // When
    numberReader.read();

    // Then
  }

  @Test
  public void we_can_read_a_string_from_terminal() {
    // Given
    String expected = "hello";
    Mockito.when(terminal.readText()).thenReturn(expected);
    TextReader textReader = new TextReader("Enter string:", terminal);

    // When
    String readText = textReader.read();

    // Then
    assertThat(readText).isEqualTo(expected);
  }
}
