package com.csl.student

import java.util.*

fun main(args: Array<String>) {

    userInput()
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("your name: ")
    var name: String = scanner.next()
    print("your english: ")
    var english: Int = scanner.nextInt()
    print("your math: ")
    var math: Int = scanner.nextInt()

    val std = StudentK(name, english, math)
    std.print()

    println("Highest score: "+ std.highestScore())
    //字串裡呼叫方法 ${ method }
    println("Highest score: ${std.highestScore()}")
}


class StudentK(var name:String, var english:Int, var math:Int) {

    fun highestScore():Int {
        var max = 0

        if (english > max) {
            max = english
        }
        else {
            max = math
        }

        //kotlin 等號/return 後可以放if else，最後得值會assign回等候左方
        //簡易版
        max = if (english > math) english else math

        //複雜版
        max = if (english > math) {

            println("This is if")
            english
        }
        else {

            println("This is else")
            math
        }

        return max
    }

    fun print() {
        println("name: "+ name+ "\tenglish: "+ english+ "\tmath: "+ math +
        "\taverage: "+ getAve()+ "\t" +
                if (getAve()>60) "PASS" else "Failed")
    }

    fun getAve():Int {
        return (english+math)/2
    }
}