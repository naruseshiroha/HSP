package com.benkyou.interface_.exercise;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(IU.a);
        System.out.println(B.a);
    }
}

interface IU {
     int a = 23;
}

class B implements IU {
}