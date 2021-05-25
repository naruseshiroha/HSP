package com.benkyou.oop.scope;

public class VarScope {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.hi();
        cat.cry();
        cat.eat();
    }
}

class Cat {
    // 全局变量(成员变量):也就是属性,作用域为整个实体 Cat 类: cry eat 等方法使用属性
    // 属性在定义时,可以直接赋值
    int age = 10;
    // 全局变量可以不赋值,直接使用,因为有默认值
    double weight; // 0.0

    public void hi() {
        // Variable 'num' might not have been initialized
        // int num; // 局部变量必须赋值后,才能使用,因为没有默认值
        int num = 1;
        String address = "TOKYO";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight); //全局变量
    }

    public void cry() {
        // 1.局部变量一般是指在成员方法中定义的变量
        // 2.n 和 name 就是局部变量
        // 3.n 和 name 的作用域在 cry 方法中
        int n = 10;
        String name = "jack";
        System.out.println("cry()... age=" + age); // 全局变量
    }

    public void eat() {
        System.out.println("eat()... age=" + age);
        // Cannot resolve symbol 'name'
        // System.out.println("name=" + name); // name 作用域在 cry()中
    }
}
