package com.hzh.kotlin.L03

interface MyInterface {

    val prop: String // need to override
    val prop2: String get() = ""  // can access but cannot change

    fun foo()
    fun bar() {
        println("foo bar!")
    }
}

class MyInterfaceImpl : MyInterface {
    override val prop = "prop"
    override val prop2 = "prop2"

    override fun foo() {
        println("foo foo")
    }
}


/////////
interface A {
    fun a() {
        println("a")
    }

    fun b() {
        println("b")
    }
}

interface B {
    fun a() {
        println("aa")
    }
    fun b() {
        println("bb")
    }
}


// has conflicts
class C : A, B {
    override fun a() {
        super<A>.a()
        super<B>.a()
    }

    override fun b() {
        super<A>.b()
        super<B>.b()
    }

}




fun main(args: Array<String>) {
    var myInterfaceImpl = MyInterfaceImpl()
    myInterfaceImpl.foo()
    myInterfaceImpl.bar()
    println("${myInterfaceImpl.prop} <--> ${myInterfaceImpl.prop2}")
    println()

    val c = C()
    c.a()
    c.b()


}

