package com.hzh.kotlin.L03


open class CC

class DD : CC() {
    fun hello() {
        println("hello kitty")
    }
}

fun CC.hello() {
    println("hello world")
}

val CC.prop: Int  // just can use val
    get() = 1
//    set(value) {  // extension prop can not set
//        field = value
//    }

fun Any?.toString(): String {
    if(this == null) return "null"

    return toString()
}


fun main(args: Array<String>) {
    CC().hello()    // hello world
    DD().hello()    // hello kitty

    val testC: CC = DD()
    testC.hello()   // still hello world  Extensions are resolved statically

    var c2: CC? = null
    println(c2.toString())  // do not throw nullpoint exception, Because it call extension funcion(statically)

    var c3 = CC();
    // c3.prop = 2;  // can not set
    println(CC().prop)

}






