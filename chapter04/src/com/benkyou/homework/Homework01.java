package com.benkyou.homework;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println(10 / 3); // 3
        System.out.println(10 / 5);  // 2
        System.out.println(10 % 2); // 0
        // a 是小数时, a % b = a - (int)a / b * b;
        System.out.println(-10.5 % 3); // -10.5 - (-10/3)*3 = -1.5
    }
}
