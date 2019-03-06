package com.csl.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
        java8();
        java();
    }


    private static void java8() {

        //Java8的新類別

        //Instant
        //預設時間格式是有帶時區的(沒指定為UTC+0) e.g.  2019-03-06T01:45:21.226Z
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println();

        //不考慮時區 e.g. 2019-03-06T09:52:21.683 格式後面沒有"Z"
        // LoaclDate=日期(年月日)   LoaclTIme=時間 LocalDateTime=日期+時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println();

        //格式化方式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String customDate = now.format(formatter);
        System.out.println(customDate);
        System.out.println();

        //將特定格式轉為時間
        String customTime = "2019/03/01 12:00:00";
        LocalDateTime time =  LocalDateTime.parse(customTime, formatter);
        System.out.println(time);
        System.out.println();

        //時間設定
        LocalDateTime other = LocalDateTime.of(2019,03,1,12,0,0);
        System.out.println(other);
        //時間運算
        //特別注意 進行運算時 並不會更改原本的時間，而是輸出另一個時間(LocalDateTime 是 immutable)
        LocalDateTime otherAfterPlus = other.plus(Duration.ofDays(10));
        System.out.println(other);
        System.out.println(otherAfterPlus);

        other.minus(Duration.ofDays(10));
        LocalDateTime otherAfterMinus = other.minus(Duration.ofDays(10));
        System.out.println(other);
        System.out.println(otherAfterMinus);

    }

    private static void java() {
        //取得當前時間
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println();

        //將時間轉為特定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String customDate = sdf.format(date);
        System.out.println(customDate);
        System.out.println();

        //將特定格式轉為時間
        String customStr = "2019/03/01 12:00:00";
        try {
            Date time = sdf.parse(customStr);
            System.out.println(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println();

        //使用calender 可以進行時間的加(其實Date也可以 只要轉成long後 作完加減法再轉回去即可)
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        //calender 可以設定時間(為獨特別注意 月份起始是0 故4月要輸入3)
        calendar.set(2019,4,1,12,0,0);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        System.out.println(calendar.getTime());
        System.out.println();

        //calender作日期加法
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        System.out.println(calendar.getTime());
    }

}
