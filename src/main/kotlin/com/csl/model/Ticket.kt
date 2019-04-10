package com.csl.model.kotlin

import kotlin.random.Random

data class Ticket(var origin:Int, var destination:Int, var price:Int)

//但是data class不能被繼承
fun main(args: Array<String>) {
    var ticket:Ticket = Ticket(20, 51, 420)

    var str:String = "1234567";
    println(str+" "+str.validate())

    println((2..20).random())
}

//Kotlin特有的擴充功能
fun String.validate():Boolean {
    return this.length>6
}

fun IntRange.random():Int  {
    val r = Random.nextInt(endInclusive-start)+start
    return r
}