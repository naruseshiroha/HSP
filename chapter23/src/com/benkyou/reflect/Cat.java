package com.benkyou.reflect;

public class Cat {
    private String name = "招财猫";
    public Integer age = 3;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void hi() {
//        System.out.println("Hi," + name + "...");
    }

    public void cry() {
        System.out.println(name + "喵喵喵...");
    }
}
