package com.csl.guess

import java.util.*

fun main(args : Array<String>) {


    //kotlin的for loop規則:
    // for (range描述)
    //https://kotlinlang.org/docs/reference/ranges.html

    println("i in 1..4")
    for (i in 1..4) {
        println(i)
    }
    println("i in 1 until 5")
    for (i in 1 until 5) {
        println(i)
    }
    println("i in 1..4 step 2")
    for (i in 1..4 step 2) {
        println(i)
    }
    println("i in 4 downTo 1")
    for (i in 4 downTo 1) {
        println(i)
    }
    println("i in 4 downTo 1 step 2")
    for (i in 4 downTo 1 step 2) {
        println(i)
    }

    val scanner:Scanner = Scanner(System.`in`)
    val random:Random = Random()
    var secret:Int = random.nextInt(10)+1
    println("secret number is "+ secret)

    for (i in 1..4) {
        var number:Int = scanner.nextInt()

        if (number > secret)
            print("lower")
        else if (number < secret)
            println("higher")
        else {
            println("you are correct, the secret is "+ secret)
            break;
        }
    }

    println("Finish")


}