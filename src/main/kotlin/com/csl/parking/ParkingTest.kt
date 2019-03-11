package com.csl.parking

import java.time.LocalDateTime

fun main(args:Array<String>) {

    val enterTime:LocalDateTime = LocalDateTime.of(2019,3,6,12,0,0)
    val leaveTime:LocalDateTime = LocalDateTime.of(2019,3,6,14,10,5)

    var car:CarKt = CarKt("AA-2345", enterTime)
    car.leaveTime = leaveTime
    var parkingHours:Int = Math.ceil(car.getDuration() / 60.0).toInt()
    println("Total parking expense = "+ parkingHours*30)
}