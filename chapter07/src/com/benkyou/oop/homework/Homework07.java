package com.benkyou.oop.homework;

public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("ShiRo", "ao", 9);
        dog.show();
    }
}

class Dog {
    private String name;
    private String color;
    private int age;

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.printf("""
                name is %s,
                color is %s,
                age is %d
                """, name, color, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}