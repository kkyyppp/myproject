package com.csl.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enterTime;
    private LocalDateTime leaveTime;

    public Car(String id, LocalDateTime enterTime) {
        this.id = id;
        this.enterTime = enterTime;
    }

    public void leave() {
        leaveTime = LocalDateTime.now();
    }

    public Duration getDuration() {
        Duration duration = Duration.between(enterTime, leaveTime);
        return  duration;
    }

    public void setLeaveTime(LocalDateTime leaveTime) {
        if (leaveTime.isAfter(enterTime))
            this.leaveTime = leaveTime;
    }
}
