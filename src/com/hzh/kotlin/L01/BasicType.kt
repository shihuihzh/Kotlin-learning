package com.hzh.kotlin.L01

fun main(args: Array<String>) {
    // Byte, Short, Int, Long, Float, Double
    val b: Byte = 1;
    val s: Short = 2;
    val i: Int = 3;
    val l: Long = 4;
    val f: Float = 5f;
    val d: Double = 6.0;
    println("$b")

    // Boolean, Char, String
    val boo: Boolean = true;
    val c: Char = 'c';
    var str: String = "Hello world"
    println(str)

    // Operations
    val o = a shr 1 and 8
    println(o)

    // array
    val arr = Array(5, {i -> (i * i).toString() })
    for (a in arr) {
        println(a)
    }

    val arr2 = intArrayOf(1991, 12, 10)
    // arr2[3] = 11; out of bounds
    println(arr2[2])

    // String Literals
    val sl: String = """
        Hello
        World
        """
    var sl2: String = """
        |Hello
        |Kitty
        """
    println(sl)
    println(sl2.trimMargin())

    // String template
    println("""${'$'}$i""")



}