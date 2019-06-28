package com.orange.dojo.elephantcarpaccio.terminal

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.io.StringReader
import java.util.*


internal class NumberReaderTest {

    @Test
    fun `I read an Integer`() {
        // Given
        val expectedNumber = 14

        val input = Scanner(StringReader(String.format("%d", expectedNumber)))
        val numberReader = NumberReader(input)

        // When
        val integer = numberReader.readInteger()

        // Then
        assertThat(integer).isEqualTo(expectedNumber)
    }

    @Test
    fun `I read a Float`() {
        // Given
        val expectedNumber = 14.4f

        val input = Scanner(StringReader(String.format("%f", expectedNumber)))
        val numberReader = NumberReader(input)

        // When
        val aFloat = numberReader.readFloat()

        // Then
        assertThat(aFloat).isEqualTo(expectedNumber)
    }


    @Test
    fun `When the input is not a number it raises an InputMismatchException if we expect an Integer`() {
        // Given
        val input = Scanner(StringReader("f45"))
        val numberReader = NumberReader(input)

        // Then
        assertThrows<InputMismatchException> {
            // When
            numberReader.readInteger()
        }
    }

    @Test
    fun `When the input is not a number it raises an InputMismatchException if we expect a Float`() {
        // Given
        val input = Scanner(StringReader("f45"))
        val numberReader = NumberReader(input)

        // Then
        assertThrows<InputMismatchException> {
            // When
            numberReader.readFloat()
        }
    }

    @Test
    fun `When the input is a Float it raises an InputMismatchException if we expect an Integer`() {
        // Given
        val input = Scanner(String.format("%f", 24.5f))
        val numberReader = NumberReader(input)

        // Then
        assertThrows<InputMismatchException> {
            // When
            numberReader.readInteger()
        }
    }
}
