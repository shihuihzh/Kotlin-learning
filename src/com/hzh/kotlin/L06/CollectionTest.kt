package com.hzh.kotlin.L06


fun main(args: Array<String>) {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6)
    val set = setOf<Int>(1, 2, 2, 3, 4, 5, 5, 6)
    val map = hashMapOf<String, Int>("a" to 1, "b" to 2)

    print("list:")
    for (i in list) {
        print("$i,")
    }

    println()

    print("set:")
    for (s in set) {
        print("$s,")
    }
    println()

    print("map:")
    for ((k, v) in map) {
        print("$k=$v, ")
    }
    println()


}

