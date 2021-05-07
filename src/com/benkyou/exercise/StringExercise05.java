package com.benkyou.exercise;

public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "java";
        Person p2 = new Person();
        p2.name = "java";

        System.out.println(p1.name.equals(p2.name)); // t
        System.out.println(p1.name == p2.name); // t
        System.out.println(p1.name == "java"); // t

        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a == b); // f
    }
}

class Person {
    public String name;
}