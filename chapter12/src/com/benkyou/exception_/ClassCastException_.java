package com.benkyou.exception_;

public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();
        B b2 = (B) b;
        C c = (C) b; // ClassCastException
    }
}

class A {
}

class B extends A {
}

class C extends A {
}