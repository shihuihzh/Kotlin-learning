package com.hzh.kotlin.L05


// label
fun testLambdaReturn(lambda: () -> Int): Int {
    return lambda()
}

inline fun testInlineLambdaReturn(lambda: () -> Int): Int {
    return lambda()
}


fun main(args: Array<String>) {

    // return need rebel
    val r = testLambdaReturn {
        println("test")
        //return 1  // not allow return directly
        return@testLambdaReturn 1;
    }

    val r2 = testLambdaReturn label@{
        println("test2")
        return@label 2;
    }

    println(r)
    println(r2)

    // inline return don't need label
    val r3 = testInlineLambdaReturn {
        println("tes3")
        // return  // can return outer function, not testInlineLambdaReturn
        return@testInlineLambdaReturn 3     // use label
    }

    println(r3)

}