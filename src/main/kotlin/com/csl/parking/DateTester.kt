package com.csl.parking

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Year
import java.time.ZoneOffset
import java.time.temporal.ChronoField
import java.util.*

fun main(args:Array<String>) {
    //取得當前時間
    var date:Date = Date()
    println(date)
    println(date.time)
    println()

    //將時間轉為特定格式
    val sdf:SimpleDateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    var custom:String = sdf.format(date)
    println(custom)
    println()

    //將特定格式轉為時間
    val customTime:String = "2019/03/01 12:00:00"
    println(sdf.parse(customTime))
    println()

    //calender 可以設定時間(為獨特別注意 月份起始是0 故4月要輸入3)
    val calender:Calendar = Calendar.getInstance()
    calender.set(2018,4,1,12,0,0)
    println(calender.time)
    calender.set(Calendar.YEAR, 2018)
    calender.set(Calendar.MONTH, 3)
    calender.set(Calendar.DAY_OF_MONTH, 10)
    println(calender.time)
    println()

    //calender作日期加法
    calender.add(Calendar.DAY_OF_YEAR, 10)
    println(calender.time)



}