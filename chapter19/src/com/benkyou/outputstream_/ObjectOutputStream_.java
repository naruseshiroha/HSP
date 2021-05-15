package com.benkyou.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:/data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据
        oos.writeInt(100); // int -> Integer(实现了 Serializable)
        oos.writeBoolean(false); // boolean -> Boolean(实现了 Serializable)
        oos.writeChar('a'); // 97, char -> Character(实现了 Serializable)
        oos.writeDouble(1); // 97, char -> Character(实现了 Serializable)
        oos.writeUTF("wo ai ni."); // String
        oos.writeObject(new Dog("WingCai",3,"JP","white")); // 对象需要实现 Serializable
        oos.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String origin;
    private String color;

    public Dog(String name, int age, String origin, String color) {
        this.name = name;
        this.age = age;
        this.origin = origin;
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
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}