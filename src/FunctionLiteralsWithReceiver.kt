package com.kotlin.ariftarpicikotlin.functionliteralswithreceiver

fun Int.printValue() {
    println(plus(4))
    println(this)
}

fun printValue2(writeSomething: Int.() -> Unit) {
    5.writeSomething()
}