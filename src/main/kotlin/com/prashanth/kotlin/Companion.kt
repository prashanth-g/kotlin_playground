package com.prashanth.kotlin

class Companion01 {
    companion object Test {
        fun callMe() = println("Inside callMe()")
    }
}

fun main(args: Array<String>) {
    Companion01.callMe()
}