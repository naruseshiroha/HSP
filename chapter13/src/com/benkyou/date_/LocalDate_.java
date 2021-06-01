package com.benkyou.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        // 第三代日期类
        // 1.now() 返回当前日期时间的对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth()); // 英文 JUNE
        System.out.println(now.getMonthValue()); // 数字 6
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        // 2.DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E");
        String format = formatter.format(now);
        System.out.println(format);

        LocalDate localDate = LocalDate.now(); // 年月日
        LocalTime localTime = LocalTime.now(); // 时分秒

        // plus 和 minus 方法对当前时间进行加减
        LocalDateTime localDateTime = now.plusDays(890);
        System.out.println(formatter.format(localDateTime));
        LocalDateTime localDateTime1 = now.minusMinutes(3456);
        System.out.println(formatter.format(localDateTime1));
    }
}
