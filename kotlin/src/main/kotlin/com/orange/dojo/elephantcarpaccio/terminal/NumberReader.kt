package com.orange.dojo.elephantcarpaccio.terminal


import java.util.*

internal class NumberReader(private val input: Scanner) {

    fun readInteger(): Int {
        try {
            return input.nextInt()
        } catch (e: InputMismatchException) {
            throw InputMismatchException("Input value is not an integer")
        }

    }

    fun readFloat(): Float {
        try {
            return input.nextFloat()
        } catch (e: InputMismatchException) {
            throw InputMismatchException("Input value is not a float")
        }

    }
}
