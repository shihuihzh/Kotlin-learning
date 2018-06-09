package com.hzh.kotlin.L06


fun main(args: Array<String>) {
    val a: Any = "hello"

    // println(a.length) // error! need case
    // smart case
    if(a is String) {
        println(a.length) // auto case
    }

    val b = a as String // to case, maybe case fail
    println(b.length)



}

