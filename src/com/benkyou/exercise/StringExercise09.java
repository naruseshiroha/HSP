package com.benkyou.exercise;

public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "321";
        String s3 = "123321";
        String s4 = (s1 + s2).intern();
        System.out.println(s3 == s4); // t
        System.out.println(s3.equals(s4)); // t
    }
}
