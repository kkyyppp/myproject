package com.csl.thread

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    var counter:Int = 0
    val times = 100000

    var ms = measureTimeMillis {
        thread {
            //kotlin數字可以用底線分隔
            for (n in 1..times)
                counter++
        }
    }
    println("one thread time: $ms")

    counter=0
    ms = measureTimeMillis {
        GlobalScope.launch {
            for (n in 1..times)
                counter++
        }
    }
    println("one coroutines time: $ms")

    counter=0
    ms = measureTimeMillis {
        for (n in 1..times) {
            thread {
                counter++
            }
        }
    }
    println("multiple thread time: $ms")

    counter=0
    ms = measureTimeMillis {
        for (n in 1..times) {
            GlobalScope.launch {
                counter++
            }
        }
    }
    println("multiple coroutines time: $ms")

    println("結論: 單一個執行緒 thread優於coroutines")
    println("結論: 多個執行緒 coroutines優於thread")
}