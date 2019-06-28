package com.orange.dojo.elephantcarpaccio


import com.orange.dojo.elephantcarpaccio.terminal.Terminal

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        demo()
    }

    private fun demo() {
        val terminal = Terminal()

        val name = terminal.whatIsYourName()
        terminal.display("Your name is $name")

        val age = terminal.whatIsYourAge()
        terminal.display("Your age is $age")
    }
}
