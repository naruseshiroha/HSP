package com.benkyou.homework;

public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String name = "outer A";

    public void f1() {
        class B {
            private final String NAME = "inner B";

            public void show() {
                System.out.println("B class NAME = " + NAME);
                System.out.println("A class name = " + A.this.name);
            }
        }

        new B().show();
    }
}
