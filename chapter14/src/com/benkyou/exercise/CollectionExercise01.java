package com.benkyou.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExercise01 {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("dog1", 6);
        dogs[1] = new Dog("dog2", 5);
        dogs[2] = new Dog("dog3", 7);
        for (Dog dog : dogs) {
            list.add(dog);
        }
        Iterator iterator = list.iterator();
        System.out.println("iterator...");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("dog=" + next);
        }
        System.out.println("foreach...");
        for (Object o : list) {
            System.out.println("dog=" + o);
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
