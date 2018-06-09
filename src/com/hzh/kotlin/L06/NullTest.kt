package com.hzh.kotlin.L06


fun main(args: Array<String>) {
    val test: String? = null

    var notThrow = test?.length // safe no NPE
    println(notThrow)
    val throwNPE = test!!.length // will throw
}