package com.benkyou.homework;

public class Homework04 {
    public static void main(String[] args) {
        int n = 153;
        System.out.printf("%d is narcissistic number?\n%s.\n", n, isNarcissisticNumber(n));
    }

    public static boolean isNarcissisticNumber(int n) {
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        return Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == n;
    }
}
