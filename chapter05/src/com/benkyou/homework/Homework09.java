package com.benkyou.homework;

public class Homework09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += fn(i);
        }
        System.out.println(sum);
    }

    public static int fn(int n) {
        if (n == 1) return 1;
        return fn(n - 1) + n;
    }
}
