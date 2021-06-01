package com.benkyou.date_;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        // 1.Instant 的 static now() 获取表示当前时间戳对象
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println();
        // 2.通过 Date 的 static from() 把 Instant 转成 Date
        Date date = Date.from(now);
        System.out.println(date);
        // 3.通过 Date 的 toInstant() 把 Date 转成 Instant
        Instant instant = date.toInstant();
        System.out.println(instant);
    }
}
