package com.orange.dojo.elephantcarpaccio.terminal


import java.util.*

internal class TextReader(private val input: Scanner) {

    fun readWord(): String {
        return input.next()
    }
}
