package com.prashanth.kotlin

fun main(args: Array<String>) {

    println(findMe("Sounds" + 'C' + "razy"))

    val list = listOf("stay", "calm" , "be", "bold" )
    if (-1 !in 0..list.lastIndex) {
        println("Out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of Indices")
    }
}

fun findMe(obj: Any): String =
        when (obj) {
            "exp"       -> "Expression"
             5          -> "You send 5"
             is String  -> "Type String"
            !is Long    -> "Not a Long"
             else       -> "What!"
}
