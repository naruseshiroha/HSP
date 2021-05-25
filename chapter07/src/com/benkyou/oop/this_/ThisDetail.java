package com.benkyou.oop.this_;

public class ThisDetail {
    public static void main(String[] args) {

    }
}

class T {
    private String name;
    private int age;

    // this 不能在类定义的外部使用,只能在类定义的方法中使用

    // 访问构造器语法:this(参数列表)
    // 注意:
    //     只能在构造器中使用(即只能在构造器中访问另外一个构造器)
    //     必须放在构造器中的第一句
    public T() {
        this("tom", 9);
        System.out.println("T() is called.");
    }

    public T(String name, int age) {
        // this 用于区分当全局变量 和 局部变量
        this.name = name;
        this.age = age;
    }

    // 访问成员方法的语法:this.方法名(参数列表)
    public void f1() {
        System.out.println("f1() is called.");
    }

    public void f2() {
        System.out.println("f2() is called.");
        // 1.f1();
        f1();
        // 2.this.f1()
        this.f1();
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