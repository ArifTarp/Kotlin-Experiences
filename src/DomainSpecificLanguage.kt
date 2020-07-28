package com.kotlin.ariftarpicikotlin.functionliteralswithreceiver2

class HTML {
    fun body() {
        println("Body")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    var html = HTML()
    html.init()
    return html
}