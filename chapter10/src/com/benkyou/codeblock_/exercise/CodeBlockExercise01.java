package com.benkyou.codeblock_.exercise;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println(Person.total);// "in static code block ..." 100
        System.out.println(Person.total);// 100
    }
}

class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("in static code block ...");
    }
}