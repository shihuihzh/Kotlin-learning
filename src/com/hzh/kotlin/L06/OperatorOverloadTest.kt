package com.hzh.kotlin.L06

data class Count(var number: Int) {
    operator fun inc(): Count {
        this.number++
        return this
    }
}

fun main(args: Array<String>) {
    var c = Count(10)
    c++
    println(c.number)
}

