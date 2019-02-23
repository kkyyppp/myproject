package com.csl.student

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("your name: ")
    var name:String = scanner.next()
    print("your english: ")
    var english:Int = scanner.nextInt()
    print("your math: ")
    var math:Int = scanner.nextInt()

    val std = StudentK(name, english, math)
    std.print()
}


class StudentK(var name:String, var english:Int, var math:Int) {

    fun print() {
        println("name: "+ name+ "\tenglish: "+ english+ "\tmath: "+ math +
        "\taverage: "+ (english+math)/2)
    }
}