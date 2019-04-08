package com.csl.io

import java.io.File

fun main(args: Array<String>) {

    write()

    read()
}


private fun write() {
    //write 不需要flush,close, kotlin會自動處理
    File("./testData/output.txt").writeText("測試第一行")

    //如果要取得物件自行操作  不需要flush,close, kotlin會自動處理
    File("./testData/output.txt").printWriter().use {
        it.println("第一行測試")
        it.println("第二行測試")
        it.println("\n測試第四行")
    }

    //若有大量資料應該使用bufferWriter
    File("./testData/output.txt").bufferedWriter().use {
        it.write("第一行測試")
        it.write("第二行測試")
        it.write("\n測試第四行")
    }
}


private fun read() {
    //read
    var strs: List<String> = File("./testData/data.txt").readLines()
    for (line in strs) {
        println(line)
    }


    //同樣大量讀取應該使用buffer
    var br = File("./testData/data.txt").bufferedReader()
    var line: String? = br.readLine()
    while (line != null) {
        println(line)
        line = br.readLine()
    }


    //可使用lambda
    File("./testData/data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}