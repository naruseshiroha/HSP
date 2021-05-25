package com.benkyou.oop.exercise;

public class ConstructorExercise {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        Person p2 = new Person("Tom", 19);
        System.out.println(p2);
    }
}

class Person {
    private String name; // 引用数据类型,默认值 null
    private int age; // 基本数据类型,默认值 0

    public Person() {
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}