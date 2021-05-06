package com.benkyou.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 父类方法不确定性的问题
    // -> 考虑将该方法设计为 abstract
    // -> 抽象方法就是没有实现的方法,没有方法体
    // 当一个类中存在抽象方法时,需要将类声明为 abstract 类
    // 一般来说,抽象类会被继承,有其子类来实现抽象方法
//    public void eat(){
//        System.out.println("animal eat...");
//    }
    public abstract void eat();
}
