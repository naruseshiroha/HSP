package com.benkyou.homework;

public class Homework03 {
    public static void main(String[] args) {
        int n = 1999;
        System.out.printf("%d year is leap year?\n%s.\n", n, isLeapYear(n));
    }

    public static boolean isLeapYear(int n) {
        return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
    }
}
