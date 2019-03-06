package com.csl.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
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
