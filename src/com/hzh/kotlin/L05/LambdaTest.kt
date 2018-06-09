package com.hzh.kotlin.L05

import com.hzh.kotlin.L01.a


// alias
typealias hello = (Int) -> Int


// as interface
class Test : hello {
    override fun invoke(p1: Int): Int {
        return p1 * 100
    }
}

// implict
fun testImplict(s: String, f: (String) -> Unit) = f(s)




fun main(args: Array<String>) {

    val list = listOf<Int>(1 ,2 ,3, 4)
    val result = list.fold(0) {
        acc, i -> acc + i
    }
    println(result)
    println()


    // receiver
    val normalRepect: (Int, String) -> String = {a: Int, b: String -> b.repeat(a)}
    val repecta: String.(Int) -> String = {a: Int -> repeat(a)}  // like extentions
    println("hello".repecta(3))
    println(normalRepect(3, "hello"))

    // testImplict
    testImplict("str") {
        println(it) // it is implict mean param
    }

    
}

