package com.orange.dojo.elephantcarpaccio.terminal

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.StringReader
import java.util.*


internal class TextReaderTest {

    @Test
    fun `I read a word`() {
        // Given
        val expectedText = "WORD"

        val input = Scanner(StringReader(expectedText))
        val textReader = TextReader(input)

        // When
        val text = textReader.readWord()

        // Then
        assertThat(text).isEqualTo(expectedText)
    }

    @Test
    fun `I read only the first word from a sentence`() {
        // Given
        val input = Scanner(StringReader("ONLY A WORD"))
        val textReader = TextReader(input)

        // When
        val text = textReader.readWord()

        // Then
        assertThat(text).isEqualTo("ONLY")
    }

    @Test
    fun `When the input is an Integer it can read it as a text`() {
        // Given
        val input = Scanner(String.format("%d", 35))
        val textReader = TextReader(input)

        // When
        val text = textReader.readWord()

        // Then
        assertThat(text).isEqualTo("35")
    }
}
