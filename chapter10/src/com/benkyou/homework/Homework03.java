package com.benkyou.homework;

public class Homework03 {
    public static void main(String[] args) {
        new Cat().shot();
        new Dog().shot();
    }
}

abstract class Animal {
    abstract void shot();
}

class Cat extends Animal {

    @Override
    void shot() {
        System.out.println("猫会喵喵叫...");
    }
}

class Dog extends Animal {

    @Override
    void shot() {
        System.out.println("狗会汪汪叫...");
    }
}
