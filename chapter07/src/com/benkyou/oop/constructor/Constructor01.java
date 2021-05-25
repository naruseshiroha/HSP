package com.benkyou.oop.constructor;

public class Constructor01 {
    public static void main(String[] args) {
        Person zs = new Person("ZS", 19);
        System.out.println(zs.getName());
        System.out.println(zs.getAge());
    }
}

class Person {
    private String name;
    private int age;

    // 1.构造器没有返回值,也不能写 void
    // 2.构造器的名称和类名 Person 一样
    // 3.(String name, int age) 是构造器形参列表,规则和成员方法一样
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
}