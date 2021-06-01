package com.benkyou.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        // 1.获取当前系统时间
        // 2.在 java.util 下
        // 3.默输出的日期格式时国外的方式,因此需要对格式进行转换
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(233233233233L);
        System.out.println(date1);


        // 1.创建 SimpleDateFormat 对象,指定相应的格式
        // 2. E 星期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String format = sdf.format(date);
        System.out.println(format);

        // 1.把一个格式化的 String 转成对应的 Date
        // 2.得到 Date, 输出时还是按照国外的方式
        // 3.在把 String -> Date,使用 sdf 格式需要和你给的 String 的格式一样,否则会抛出转换异常
        String s = "2021-06-01 22:11:58 周二";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
