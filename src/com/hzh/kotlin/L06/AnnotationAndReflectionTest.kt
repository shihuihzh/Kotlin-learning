package com.hzh.kotlin.L06

import kotlin.reflect.full.primaryConstructor

@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD, AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class TestAnn(val name: String, val value: String)

@TestAnn("class", "myClass")
class MyClass(@TestAnn("param", "test") val test: String)


// bound
val bb = 1;


fun main(args: Array<String>) {
    println(MyClass::class)      // kotlin type class instance
    println(MyClass::class.java) // java type class instance
    println()

    println(::bb.get())
    println(::bb.name)

    val clazz = MyClass::class;
    val annotation = clazz.annotations[0]
    val annotation1 = clazz.primaryConstructor!!.parameters[0].annotations[0]
    if(annotation is TestAnn) {
        println("MyAnn: name=${annotation.name}, value=${annotation.value}")
    }
    if(annotation1 is TestAnn) {
        println("MyAnn in method: name=${annotation1.name}, value=${annotation1.value}")
    }


}