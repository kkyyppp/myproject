package com.csl.parking;

import java.time.LocalDateTime;

public class ParkingTest {

    public static void main(String[] args) {
        LocalDateTime enterTime = LocalDateTime.of(2019,3,6,12,0,0);
        LocalDateTime leaveTime = LocalDateTime.of(2019,3,6,14,10,5);
        Car car = new Car("AB-2345", enterTime);

        car.setLeaveTime(leaveTime);
        System.out.println(car.getDuration().toMinutes());
        int hour = (int) Math.ceil(car.getDuration().toMinutes() / 60.0);
        System.out.println("car parking hour: "+hour);
        System.out.println("total expense: " + hour*30);
    }



}
