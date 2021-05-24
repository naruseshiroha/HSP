package com.benkyou.oop.exercise;

public class OOPExercise01 {
    public static void main(String[] args) {
        Person02 a = new Person02();
        a.age = 10;
        a.name = "ShiRo";
        Person02 b = a;
        System.out.println(b.name); // ShiRo
        b.age = 200;
        b = null;
        System.out.println(a.age); // 200
        System.out.println(b.age); // NullPointerException


    }
}

class Person02 {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}