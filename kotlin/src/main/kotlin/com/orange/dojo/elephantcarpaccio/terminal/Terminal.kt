package com.orange.dojo.elephantcarpaccio.terminal

import java.io.PrintWriter
import java.util.*

class Terminal internal constructor(input: Scanner, private val output: PrintWriter) {
    private val numberReader: NumberReader
    private val textReader: TextReader

    constructor() : this(Scanner(System.`in`), PrintWriter(System.out, true))

    init {
        // To change the local
        //input.useLocale(Locale.US);
        this.numberReader = NumberReader(input)
        this.textReader = TextReader(input)
    }

    fun whatIsYourAge(): Int {
        display("What is your age? :")
        return numberReader.readInteger()
    }

    fun whatIsYourName(): String {
        display("What is your name? :")
        return textReader.readWord()
    }

    fun display(message: String) {
        output.println(message)
    }
}
