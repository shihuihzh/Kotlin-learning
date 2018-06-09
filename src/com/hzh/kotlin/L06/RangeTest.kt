package com.hzh.kotlin.L06

fun main(args: Array<String>) {
    for (i in 1..10) {
        print("$i, ")
    }
    println()

    for (i in 1 until 10) {
        print("$i, ")
    }
    println()

    for(i in 10 downTo 1) {
        print("$i, ")
    }
    println()

    for (i in 1..10 step 2) {
        print("$i, ")
    }
    println()

}

