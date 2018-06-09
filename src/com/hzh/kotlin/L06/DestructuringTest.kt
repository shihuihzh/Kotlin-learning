package com.hzh.kotlin.L06


fun returnTwo(a: Int, b: Int): Pair<Int, Int> {
    return Pair(a, b)
}

fun main(args: Array<String>) {

    val map = mutableMapOf<String, String>()
    map["a"] = "aaa"
    map["b"] = "aaa"
    map["d"] = "aaa"
    map["c"] = "aaa"

    for ((key, value) in map) {
        println("$key = $value")
    }

    val (a, b) = returnTwo(1, 2);
    println("$a, $b")


}

