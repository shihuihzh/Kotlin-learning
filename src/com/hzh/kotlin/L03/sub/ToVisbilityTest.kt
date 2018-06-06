package com.hzh.kotlin.L03.sub

private fun foo() {
    println("foo")
}

public var bar = 5
    private set

internal val baz = 6


open class Outer {
    private val a = 1;
    protected open val b = 2;
    internal val c = 3;
    val d = 4;
}

class SubClass private constructor(): Outer() {
    override val b = 3;
}