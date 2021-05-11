package com.benkyou.homework;

public class Homework08 {
    public static void main(String[] args) {
        double sum = 0;
        double temp;
        for (int i = 1; i <= 100; i++) {
            temp = 1.0 / i;
            if ((i & 1) == 0) temp *= -1;
            sum += temp;
        }
        System.out.println(sum);
    }
}
