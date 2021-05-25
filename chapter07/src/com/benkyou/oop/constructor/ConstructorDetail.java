package com.benkyou.oop.constructor;

public class ConstructorDetail {
    public static void main(String[] args) {
        Dog shiRo = new Dog("ShiRo", 9);
        System.out.println(shiRo);
        Dog kuRo = new Dog("KuRo");
        kuRo.setAge(8);
        System.out.println(kuRo);
        Dog miDoRi = new Dog(7);
        kuRo.setName("MiDoRi");
        System.out.println(miDoRi);
    }
}

class Dog {
    private String name;
    private int age;
    // 如果没有定义构造器,系统会自动给类生成一个默认的无参构造器
    // Dog() {}

    // 一旦定义了自己的构造器,系统就不会自动生成无参构造器,需要显示定义无参构造器
    // 构造器是完成对象的初始化,并不是创建对象,在创建对象时,系统会自动的调用对应的构造方法
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    // 构造器可以重载
    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
