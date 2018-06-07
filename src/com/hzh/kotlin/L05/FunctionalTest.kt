package com.hzh.kotlin.L05

// defualt parameter
open class A {
    open fun foo(i: Int = 10) {
        println(i)
    }
}

class B : A() {
    override fun foo(i: Int) {  // use base class default
        println(i)
    }
}

fun lastIsLambda(a: Int = 1, b: Int = 2, qux: () -> Unit) {
    println("a=$a, b=$b")
    qux();
}

fun defaultPrameter(a: Int = 1, b: Int = 2): Unit { // Unit mean return nothing
    println("sum:${a+b}")
}

// single-expression function
fun max(a: Int, b: Int) = if(a > b) a else b

// varargs
fun myPrintln(vararg a: String) {
    for (s in a) {
        print("$s ")
    }
    println()
}

// infix notation
infix fun String.say(str: String) {
    println("$this say: '$str'")
}

fun main(args: Array<String>) {
    // default
    val b = B()
    b.foo()
    println()

    // 1. If lambda at last parameter
    lastIsLambda(b = 22) { println("lambda!!")}
    lastIsLambda { println("lambda2!!") }

    // 2. default parameter placed and name
    defaultPrameter(1, b = 100) // allow
    //defaultPrameter(a = 100, 10) // now allow

    // 3. varages
    val strList = arrayOf("hello", "kitty")
    myPrintln("hello", "world", "are", "you", "ok", *strList) // '*' use to spread

    // 4. infix
    "Tranch" say "I buy a pajamas!"
}






