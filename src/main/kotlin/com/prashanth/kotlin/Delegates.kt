package com.prashanth.kotlin

import kotlin.reflect.KProperty

class Example {
    var testVar: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, Delegating '${property.name}'"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, s: String) {
        println("$s assigned to '${property.name}' in $thisRef.")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    e.testVar = "TestString"
    println(e.testVar)
}
