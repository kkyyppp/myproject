package com.csl.network.kt

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val urlStr:String = "http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f"
    val url:URL = URL(urlStr)

    var br:BufferedReader = BufferedReader(InputStreamReader(url.openConnection().getInputStream()))

    //如果有宣告型態則不能被assign為null除非宣告時有加"?" 或是 !
    var line = br.readLine()
    var sb:StringBuffer = StringBuffer()

    while ( line !=null) {
        sb.append(line+"\n")
        line = br.readLine()
    }
    println(sb.toString())

    //way 2 使用with方法可以直接使用()內參數的所有方法而不用使用參數本身
    with(url.openConnection() as HttpURLConnection) {

        sb = StringBuffer()
        inputStream.bufferedReader().lines().forEach {
            sb.append(it+"\n")
        }

        println(sb.toString())
    }

    //way3 readText直接取得資料
    println(url.readText())
}