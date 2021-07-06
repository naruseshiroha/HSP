package com.benkyou.outputstream_;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    // Integer extends Number implements Serializable
    // 序列化具备可继承性
    private int age;
    // 序列化对象时,默认将里面所有属性都进行序列化,但除了static或transient修饰的成员
    private static String origin;
    private transient String color;
    // 序列化对象时,要求里面属性的类型也需要实现序列化接口
    private Master master = new Master();
    // serialVersionUID 序列化的版本号,可以提高兼容性
    private static final Long serialVersionUID = 1L;

    public Dog(String name, int age, String origin, String color) {
        this.name = name;
        this.age = age;
        Dog.origin = origin;
        this.color = color;
    }

    public Dog() {
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        Dog.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + ", origin='" + origin + '\'' + ", color='" + color
                + ", master=" + master + '\'' + '}';
    }
}
