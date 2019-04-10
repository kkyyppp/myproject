package com.csl.thread.kt

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args:Array<String>) {

    //輕量化thread 更快速 -> coroutines
    // implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.2.0-alpha-2'
    GlobalScope.launch {
        for (i in 1..100)
            println("Coroutines: ${i}")

        delay(50)
    }


    //way 1
    val runnable:Runnable = Runnable {
        for (i in 1..100)
            println("Runnable: "+ i)
        Thread.sleep(50)
    }
    Thread(runnable).start()


    //way 2
    Thread({
        for (i in 1..100)
            println("Thread: "+ i)
        Thread.sleep(50)
    }).start()

    //way 3
    thread {
        for (i in 1..100)
            println("com.csl.thread(): "+ i)
        Thread.sleep(50)
    }




}
