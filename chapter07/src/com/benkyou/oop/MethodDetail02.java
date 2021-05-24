package com.benkyou.oop;

public class MethodDetail02 {
    public static void main(String[] args) {
        B b = new B();
        b.sayOk();
        b.m1();
    }
}

class B {
    // 同一个类中的方法调用:直接调用即可
    public void print(int n) {
        System.out.println("print() is called. n is " + n);
    }

    public void sayOk() {
        print(10);
        System.out.println("sayOk() is called. ");
    }

    // B 类调用 C 类方法:通过对象名调用
    public void m1() {
        // 创建 C 对象,然后调用 C 类方法即可
        C c = new C();
        c.hi();
        System.out.println("m1() is called.");
    }
}

class C {
    public void hi() {
        System.out.println("C hi() is called.");
    }
}
