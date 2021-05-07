package com.benkyou.exercise;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b); // f
        System.out.println(a.equals(b)); // t
        // intern()返回常量池的地址
        System.out.println(a==b.intern()); // t
        System.out.println(b==b.intern());// f
    }
}
