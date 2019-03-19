package com.csl.parking

import java.time.Duration
import java.time.LocalDateTime

class CarKt(id: String, enterTime: LocalDateTime) {

    var id:String=""
    var enterTime:LocalDateTime
    var leaveTime:LocalDateTime = LocalDateTime.now()
        set(value) {
            if (leaveTime.isAfter(enterTime))
                field = value
        }

    init {
        this.id = id
        this.enterTime = enterTime
    }

    fun getDuration():Long {
        return Duration.between(enterTime, leaveTime).toMinutes()
    }



}