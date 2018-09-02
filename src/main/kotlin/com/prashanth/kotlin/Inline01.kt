package com.prashanth.kotlin

inline fun op(op:()->Unit){
    println("Before lambda")
    op()
    println("After lambda")
}

fun main(args: Array<String>) {
    op({println("Actual function")})
}
