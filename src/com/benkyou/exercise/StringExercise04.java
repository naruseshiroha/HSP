package com.benkyou.exercise;

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3); // f
        System.out.println(s2 == s4); // t
        System.out.println(s2.equals(s3)); // t
        System.out.println(s2 == s3); // f
    }
}
