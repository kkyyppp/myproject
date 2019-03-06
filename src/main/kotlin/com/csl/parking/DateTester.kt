package com.csl.parking

import java.text.SimpleDateFormat
import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoField
import java.util.*

fun main(args:Array<String>) {

    java8()
   // java()
}

fun java8() {
    //Instant
    //預設時間格式是有帶時區的(沒指定為UTC+0) e.g.  2019-03-06T01:45:21.226Z
    val instant:Instant = Instant.now()
    println(instant)
    println()

    //不考慮時區 e.g. 2019-03-06T09:52:21.683 格式後面沒有"Z"
    //LoaclDate=日期(年月日)   LoaclTIme=時間 LocalDateTime=日期+時間
    val now:LocalDateTime = LocalDateTime.now()
    println(now)
    println()

    //格式化方式
    val formatter:DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
    var customTime = now.format(formatter)
    println(customTime)
    println()

    //將特定格式轉為時間
    val customStr:String = "2019/03/01 12:00:00"
    val time = LocalDateTime.parse(customStr, formatter)
    println(time)
    println()

    //時間設定
    val other:LocalDateTime = LocalDateTime.of(2019,3,1,12,0,0)
    println(other)
    //時間運算
    //特別注意 進行運算時 並不會更改原本的時間，而是輸出另一個時間(LocalDateTime 是 immutable)
    val otherAfterPlus = other.plus(Duration.ofDays(10))
    println(other)
    println(otherAfterPlus)
    val otherAfterMinus = other.minus(Duration.ofDays(10))
    println(other)
    println(otherAfterMinus)
}

private fun java() {
    //取得當前時間
    var date: Date = Date()
    println(date)
    println(date.time)
    println()

    //將時間轉為特定格式
    val sdf: SimpleDateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    var custom: String = sdf.format(date)
    println(custom)
    println()

    //將特定格式轉為時間
    val customTime: String = "2019/03/01 12:00:00"
    println(sdf.parse(customTime))
    println()

    //calender 可以設定時間(為獨特別注意 月份起始是0 故4月要輸入3)
    val calender: Calendar = Calendar.getInstance()
    calender.set(2018, 4, 1, 12, 0, 0)
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