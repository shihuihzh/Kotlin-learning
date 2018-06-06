package com.hzh.kotlin.L04

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl : Base {
    override fun printMessage() {
        println("base message")
    }

    override fun printMessageLine() {
        println("base line message")
    }
}

class DelegationBase(b: Base) : Base by b {  // no need to implement method, auto delegation

    override fun printMessage() {
        println("delegation base message!!")
    }
}

/////////////////////////////
class Example {
    var prop: String by Delegate()
    val name: String by lazy {
        println("computed")
        "Zhanhao"
    }
    var observer: String by Delegates.observable("no name") {
        prop, old, new ->
        println("[prop:${prop.name}] $old -> $new")
    }
}

class User(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


fun main(args: Array<String>) {

    // ======== about class
    val baseImpl = BaseImpl()
    val delegationBase = DelegationBase(baseImpl)

    delegationBase.printMessage()
    delegationBase.printMessageLine()
    println()

    // ======== prop
    var example = Example()
    example.prop = "hello"
    println("get value: ${example.prop}") // be overrided

    println(example.name) // lazy

    // observer
    println(example.observer)
    example.observer = "a"
    example.observer = "b"
    example.observer = "c"

    // map
    val user = User(mutableMapOf(
        "name" to "Zhanhao",
        "age" to 28
    ))
    println("${user.name}, ${user.age}")


}