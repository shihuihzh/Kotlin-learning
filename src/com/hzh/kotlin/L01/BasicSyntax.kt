package com.hzh.kotlin.L01

import java.awt.PrintGraphics


/**
 *  defind function
 */
// 1
// fun sum (a: Int, b: Int): Int {
//   return a + b
//}

// 2
fun sum(a: Int, b: Int) = a + b

// no return no meaningful value
fun printSum(a: Int, b: Int): Unit {  // Unit can be omitted
    println("sum of $a and $b is ${a + b}");
}

/**
 * defind variables
 */
// readonly variable
val a: Int = 1;
val b = 2; // Int type is inferred
//val c: Int;  // need in a function
//c = 1;

// mutable variable
var d = 10;
//d = 11

/**
 * String template
 */
val s1 = "$a + $b = ${a + b}"
val s2 = "${s1.replace("+", "*")}"

/**
 * conditional expressions
 */
// 1
// fun maxOf(a: Int, b: Int): Int {
//    if(a > b) {
//        return a;
//    } else {
//        return b;
//    }
//}

// 2
fun maxOf(a: Int, b: Int) = if(a > b) a else b

/**
 * nullable
 */
fun parseInt(i: String): Int? { // can reutrn null
    return null;
    //return Integer.valueOf(i);
}

/**
 * Using type checks and automatic casts
 */
fun getStringLength(obj: Any): Int? {
    if(obj is String) {
        return obj.length
    }

    return null;
}



fun main(args: Array<String>) {


    // call function
    println(sum(1, 1))
    println(printSum(1, 1))
    println()

    // print string template
    println(s1)
    println(s2)
    println()

    // if test
    println(maxOf(100, 101))
    println()

    // type safe
    println(getStringLength("Hello"))
    println(getStringLength(1))
    println()

    // for loop
    val items = listOf<String>("apple", "banana", "orange")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("$index is ${items[index]}");
    }
    println()

    // while loop
    var index = 0
    while(index < items.size) {
        println("$index is ${items[index]}")
        index++
    }
    println()

    // when expression
    val desc: Any = "String"
    fun describe(desc: Any) = when(desc) {
        is String -> "String"
        is Long -> "Long"
        else -> "unknown"
    }
    println(describe(desc))
    println()

    // range
    for(i in 1..10) {
        print("$i, ")
    }
    println()
    for(i in 1..20 step 2) {
        print("$i, ")
    }



}




