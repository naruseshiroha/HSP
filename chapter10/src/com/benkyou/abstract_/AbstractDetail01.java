package com.benkyou.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        // 抽象类不能实例化
//        new A(); // cannot be instantiated


    }
}

// 抽象类可以没有abstract方法,也可以有非abstract方法
abstract class A {
    public static void hi() {
        System.out.println("A hi() is called...");
    }
}

// 类包含了 abstract 方法,则这个类必须声明为 abstract
abstract class B {
    public abstract void hi();
    // abstract 只能修饰类和方法,不能修饰属性
//    public abstract static int n1 = 1;
}