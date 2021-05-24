package com.benkyou.oop;

public class Object02 {
    public static void main(String[] args) {
        /*
         1.先加载 Person01 类信息(属性和方法信息只会加载一次)
         2.在堆中分配空间,进行默认初始化
         3.把地址赋给 p, p 就指向对象
         4.进行指定初始化,比如 p.name = "ShiRo"; p.age = 10;
         */
        Person01 p1 = new Person01();
        p1.name = "shiRo";
        p1.age = 10;
        Person01 p2 = p1;
        System.out.println(p2.age); // 10
        p1.age = 11;
        System.out.println(p2.age); // 11
    }
}

class Person01 {
    String name;
    int age;
}
