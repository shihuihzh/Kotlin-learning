package com.hzh.kotlin.L06


fun main(args: Array<String>) {
    val s: String? = null

    try {
        val l = s!!.length;
    } catch (e : Exception) {
        println("err: ${e.message}")
    }

    // throw
    val b = s?.length ?: throw RuntimeException("throw err!") // elvis expression

}

