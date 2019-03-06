package com.csl.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
        java8();
        java();
        test();
    }


    private static void test() {
        Date dateNow = new Date();
        LocalDateTime now = LocalDateTime.now();
        //毫秒
        System.out.println( dateNow.getTime() );
        //秒
        System.out.println( now.toEpochSecond(ZoneOffset.ofHours(9)) );
        System.out.println( now.atZone(ZoneId.systemDefault()).toEpochSecond() );
        //毫秒
        System.out.println( now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() );
        System.out.println( now.toInstant(ZoneOffset.ofHours(8)).toEpochMilli() );
    }



    private static void java8() {

        //Java8的新類別

        //Instant
        //預設時間格式是有帶時區的(沒指定為UTC+0) e.g.  2019-03-06T01:45:21.226Z
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println();

        //LocalDateTime 此類別本身不包含時區 e.g. 2019-03-06T09:52:21.683 格式後面沒有"Z"
        // LoaclDate=日期(年月日)   LoaclTIme=時間 LocalDateTime=日期+時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println();

        //因為LocalDateTime類別本身不包含時區，但可以在輸出long值時設定時區
        //e.g. 2019/03/01 12:00:00 設定時區為東京(+8)，但在輸出toEpochSecond(unix time -單位"秒")時
        //推算回UTC則會是 2019/03/01 03:00:00 的秒數
        //https://www.codebyamir.com/blog/add-a-timezone-to-localdatetime-with-zoneddatetime-in-java-8
        //時區表: https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/
        //台北 = Asia/Taipei
        Date date = new Date();
        LocalDateTime nowCheck = LocalDateTime.now();
        System.out.println( date);
        System.out.println( date.getTime());
        System.out.println( nowCheck.toEpochSecond(ZoneOffset.ofHours(9)));
        System.out.println( nowCheck.atZone(ZoneId.of("Asia/Tokyo")).toEpochSecond());
        System.out.println( nowCheck.toInstant(ZoneOffset.ofHours(9)).toEpochMilli());
        System.out.println( nowCheck.atZone(ZoneId.of("Asia/Tokyo")).toInstant().toEpochMilli());
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
