package com.csl.guess

import java.util.*

fun main() {

    val scanner:Scanner = Scanner(System.`in`)
    val secret:Int = Random().nextInt(10)+1
    println("Secret: $secret")
    var number:Int=0

    while(secret!=number) {
       // number = scanner.nextInt()
        //kotlin另一種讀取字串
        number = readLine()!!.toInt()

        if (secret < number)
            println("lower")
        else if (secret > number)
            println("higher")
        else
            println("You got it, the number is: "+ number)
    }
}