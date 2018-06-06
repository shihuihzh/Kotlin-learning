package com.hzh.kotlin.L02


fun testIfMax(a: Int, b: Int): Int {
    val max: Int;
    if (a > b) {
        max = a;
    } else {
        max = b;
    }

    return max
}

fun testIfWhenMax(a: Int, b: Int): Int {
    when {
        a > b -> return a
        else -> return b
    }
}

fun main(args: Array<String>) {
    // if
    testIfMax(1, 2)

    // when
    testIfWhenMax(1, 2)

    // loop
    for (i in 1..3) {
        println(i)
    }

    for ((a, i) in arrayOf(1, 2, 3).withIndex()) {
        print("arr[${i-1}] = $a, ")
    }


}

