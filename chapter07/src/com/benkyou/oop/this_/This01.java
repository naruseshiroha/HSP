package com.benkyou.oop.this_;

public class This01 {
    public static void main(String[] args) {
        Dog aka = new Dog("Aka", 5);
        System.out.println(aka);
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name; // name 是形参, this.name 是全局属性
        this.age = age;
    }

    public Dog() {
//        this("AO",9);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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