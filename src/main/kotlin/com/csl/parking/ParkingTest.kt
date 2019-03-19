package com.csl.parking

import java.time.LocalDateTime

fun main(args:Array<String>) {

    val parkingLot:HashMap<String, CarKt> = HashMap<String, CarKt>()
    var enter:LocalDateTime = LocalDateTime.of(2019,3,19,10,0,0)
    var leave:LocalDateTime = LocalDateTime.of(2019,3,19,12,30,0)

    //car 1 enter
    var car:CarKt = CarKt("AA-1234", enter)
    parkingLot.put(car.id, car )
    //car 2 enter
    car = CarKt("BB-4567", enter.plusMinutes(35))
    parkingLot.put(car.id, car)
    //car 1 leave
    car = parkingLot.get("AA-1234")!!
    car.leaveTime =leave
    println("${car.id} enter: ${car.enterTime} leave: ${car.leaveTime}  duration: ${car.getDuration()}")
    parkingLot.remove("AA-1234")
    println(parkingLot.size)

    //car 2 leave
    car = parkingLot.get("BB-4567")!!
    car.leaveTime = leave.plusHours(2)
    println("${car.id} enter: ${car.enterTime} leave: ${car.leaveTime}  duration: ${car.getDuration()}")
    parkingLot.remove("BB-4567")
    println(parkingLot.size)






    /*
    val enterTime:LocalDateTime = LocalDateTime.of(2019,3,6,12,0,0)
    val leaveTime:LocalDateTime = LocalDateTime.of(2019,3,6,14,10,5)

    var car:CarKt = CarKt("AA-2345", enterTime)
    car.leaveTime = leaveTime
    var parkingHours:Int = Math.ceil(car.getDuration() / 60.0).toInt()
    println("Total parking expense = "+ parkingHours*30)
    */
}