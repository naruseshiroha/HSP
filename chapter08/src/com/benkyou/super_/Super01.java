package com.benkyou.super_;

public class Super01 {
    public static void main(String[] args) {
        B b = new B();
        b.sum(); // B sum(). A cal(). 999 999 999
        System.out.println();
        b.test(); // 999 A cal().
    }
}
