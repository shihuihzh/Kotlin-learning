package com.hzh.kotlin.L06


// receiver
class A {
    inner class B {
        fun Int.foo() {
            var a = this@A // obj A
            var b = this@B // obj B

            var c = this  // foo, an Int
            var c1 = this@foo // foo, an Int

            val funList = lambda@ fun String.() {
                var d = this // funList receiver
            }

            var funList2 = { s: String -> {
                var d1 = this
            }}

        }
    }
}

fun main(args: Array<String>) {


}

