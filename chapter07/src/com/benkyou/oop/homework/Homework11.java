package com.benkyou.oop.homework;

public class Homework11 {
    public static void main(String[] args) {
        Homework11 hw = new Homework11();
        System.out.println(hw.method(hw.method(10.0, 20.0), 100));
    }

    public double method(double d1, double d2) {
        return d1 > d2 ? d1 : d2;
    }
}
