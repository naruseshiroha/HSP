package com.benkyou.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
        /*
        A
        B(String name)
        B
         */
    }
}

class A {
    A() {
        System.out.println("A");
    }

    A(String name) {
        System.out.println("A(String name)");
    }
}

class B extends A {
    B() {
        this("ABC");
        System.out.println("B");
    }

    B(String name) {
        System.out.println("B(String name)");
    }
}