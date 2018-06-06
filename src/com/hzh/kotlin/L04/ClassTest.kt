package com.hzh.kotlin.L04

// data class
data class Persion(var name: String, var age: Int) {
    val sex: String = "man"

    operator fun component3(): String {
        return this.sex;
    }
}

// sealed class
sealed abstract class Shape {  // just can inheritance in this file
    abstract  fun print()
}

class Rect : Shape() {
    override fun print() {
        println("Rect...")
    }
}

class Trans : Shape() {
    override fun print() {
        println("Trans...")
    }
}

fun printShape(shape: Shape) = when(shape) {
    is Rect -> shape.print()
    is Trans -> shape.print()

    // no need else becase all subclass here
}


// nested class and inner class
class Outer {
    class nested

    inner class inner()
}


// enum
enum class Color(val c: Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}

// just a object
object MyObject {
    val value = 1;
}


fun main(args: Array<String>) {

    // data class
    val p = Persion("Zhanhao", 27)
    p.age = p.age - 1
    println(p) // auto toString

    var p2 = p.copy(name = "Zhanhao2")
    println(p2)

    // Destructuring
    val (name, age, sex) = p2
    println("$name, $age, $sex")
    println()


    // sealed class
    printShape(Rect())
    println()

    // inner and nested
    Outer.nested() // not need outer to instance
    Outer().inner()  // need outer to Instance

    Thread(object: Runnable {  // use object to create a annoymous class
        override fun run() {
            println("run!!!")
        }
    }).start()
    println()


    // enmu
    val c = Color.valueOf("RED")
    println(c.c)

    // object
    println(MyObject.value)  // is a object already
    val innerObj = object {
        val value = 100
    }
    println(innerObj.value)
    println()




}









