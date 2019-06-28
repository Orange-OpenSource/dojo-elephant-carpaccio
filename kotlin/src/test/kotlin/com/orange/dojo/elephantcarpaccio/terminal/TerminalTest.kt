package com.orange.dojo.elephantcarpaccio.terminal

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.PrintWriter
import java.io.StringReader
import java.io.StringWriter
import java.util.*

class TerminalTest {

    @Test
    fun `I can enter my name from the terminal`() {
        // Given
        val expectedName = "Jeff"

        val input = Scanner(StringReader(expectedName))
        val output = PrintWriter(StringWriter())

        val terminal = Terminal(input, output)

        // When
        val name = terminal.whatIsYourName()

        // Then
        assertThat(name).isEqualTo(expectedName)
    }

    @Test
    fun `I can enter my age from the terminal`() {
        // Given
        val expectedAge = 35
        val input = Scanner(StringReader(String.format("%d", expectedAge)))
        val output = PrintWriter(StringWriter())

        val terminal = Terminal(input, output)

        // When
        val age = terminal.whatIsYourAge()

        // Then
        assertThat(age).isEqualTo(expectedAge)
    }
}
