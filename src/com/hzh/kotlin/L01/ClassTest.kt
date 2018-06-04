package com.hzh.kotlin.L01

open class Base constructor(name: String) {
    open val firstName = name.toUpperCase()

    init {
        println("Init Base...")
    }

    open fun print() {
        println("test...")
    }
}

class Person(override val firstName: String, val lastName: String) : Base(firstName) {
    init {
        println("Init Person...")
    }

    val size = firstName.length.also { println("name size is: $it") }

    // secondary constructor
    constructor() : this("Hello", "kitty")

    override fun print() {
        super.print()
        println("${this.firstName} ${this.lastName}")
    }


    inner class InnerPerson {
        fun print() {
            super@Person.print()
            println("inner person")
        }
    }
}

////////////////////////////////////////////////////
open class A {
    open fun a() {
        println("a")
    }

    open fun b() {
        println("b")
    }
}

interface B {
    fun d() {
        println("d")
    }

    fun e() {
        println("e")
    }
}

class C : A(), B {

//    override  fun a() {
//
//    }
//
//    override  fun b() {
//
//    }
//
}

//////////////////////////////////////////////////////////
class Phone {
    var color = ""
        set(value) {
            println("setting color...")
            field = value
            //color = value DON'T DO THIS
        }
    var name = ""
    var price = 0.0

    var desc: String = ""
        get() = "name = $name, color = $color, price = $price"
        private set
}


fun main(args: Array<String>) {
    val p = Person("Zhanhao", "Huang")
    val p2 = Person()
    val ip = Person().InnerPerson()
    p.print()
    p2.print()
    ip.print()
    println()


    //
    val c = C();
    c.a()
    c.d()

    //
    val phone = Phone()
    phone.color = "red"
    phone.name = "iPhone"
    phone.price = 1000.0
    //phone.desc = ""
    println(phone.desc)
}