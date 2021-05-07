package com.benkyou.exercise;

public class StringExercise08 {
    public static void main(String[] args) {
        // 创建了几个对象
        String a = "hello";
        String b = "world";
        String c = a + b;
        String d = "helloworld";
        System.out.println(c == d); // f
        String e = "hello" + b;
        System.out.println(d == e); // f
        String f = "hello" + "world";
        System.out.println(d == f); // t
    }
}
