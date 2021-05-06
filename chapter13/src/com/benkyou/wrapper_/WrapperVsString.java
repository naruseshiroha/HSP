package com.benkyou.wrapper_;

public class WrapperVsString {
    public static void main(String[] args) {
        // Integer -> String
        Integer i = 100; // 自动装箱
        // 方式1
        String s1 = "" + i;
        // 方式2
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        // String -> Integer
        String str = "1234";
        Integer n1 = Integer.parseInt(str); // 自动装箱
        Integer n2 = new Integer(str); // 构造器
    }
}
