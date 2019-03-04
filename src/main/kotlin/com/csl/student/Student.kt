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
    println("Highest score: "+ std.highestScore())
    //字串裡呼叫方法 ${ method }
    println("Highest score: ${std.highestScore()}")


    std.print()

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

        var avg:Int = getAvg()

        //if else可放入
        println("name: "+ name+ "\tenglish: "+ english+ "\tmath: "+ math +
        "\taverage: "+ avg+ "\t" +
                if (avg>60) "PASS" else "Failed")

        var level:Char = getGrade(avg)
        println("Grade: "+ level)


        //全部改寫print
        println("name: $name\tenglish: $english\tmath: $math\taverage: ${getAvg()}\t${passOrFailed()}\tGrade: ${getGrade(getAvg())}")
    }

    private fun getAvg():Int {
        return (english+math)/2
    }

    //fun 可以直接利用 = 運算的結果
     fun getGrade(avg:Int) = when (avg) {
                in 90..100 -> 'A'
                80,81,82,83,84,85,86,87,88,89 -> 'B'
                in 70..79 -> 'C'
                in 60..69 -> 'D'
                else -> 'F'
            }

    fun getGrade2(avg:Int):Char {

        var level =
            when (avg) {
                in 90..100 -> 'A'
                80,81,82,83,84,85,86,87,88,89 -> 'B'
                in 70..79 -> 'C'
                in 60..69 -> 'D'
            else -> 'F'
        }

        return level
    }

    fun passOrFailed() = if (getAvg()>60) "PASS" else "FAILED"

}