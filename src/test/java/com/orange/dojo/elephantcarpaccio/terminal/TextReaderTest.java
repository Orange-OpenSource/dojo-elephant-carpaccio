package com.orange.dojo.elephantcarpaccio.terminal;

import static org.fest.assertions.Assertions.assertThat;

import java.io.StringReader;
import java.util.Scanner;

import org.junit.Test;

public class TextReaderTest {

  @Test
  public void I_Read_A_Word() {
    // Given
    String expectedText = "WORD";

    Scanner input = new Scanner(new StringReader(expectedText));
    TextReader textReader = new TextReader(input);

    // When
    String text = textReader.readWord();

    // Then
    assertThat(text).isEqualTo(expectedText);
  }
  
  @Test
  public void I_Read_Only_The_First_Word_From_A_Sentence() {
    // Given
    Scanner input = new Scanner(new StringReader("ONLY A WORD"));
    TextReader textReader = new TextReader(input);
    
    // When
    String text = textReader.readWord();
    
    // Then
    assertThat(text).isEqualTo("ONLY");
  }
  
  @Test
  public void when_The_Input_Is_An_Integer_It_Can_Read_It_As_A_Text() {
    // Given
    Scanner input = new Scanner(String.format("%d", 35));
    TextReader textReader = new TextReader(input);
    
    // When
    String text = textReader.readWord();
    
    // Then
    assertThat(text).isEqualTo("35");
  }
}
