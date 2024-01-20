package com.example.markwon

import org.commonmark.parser.Parser

interface MarkwonPlugin {

    interface Action<P : MarkwonPlugin> {
        fun apply(p: P)
    }

    interface Registry {
        fun <P : MarkwonPlugin> require(plugin: Class<P>): P

        fun <P : MarkwonPlugin> require(plugin: Class<P>, action: Action<in P>)
    }

    fun configure(registry: Registry)

    fun configureParser(parser: Parser.Builder)


}
