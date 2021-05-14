package com.benkyou.homework;

public class Homework01 {
    public static void main(String[] args) {
        int cash = 10_0000;
        int times = 0;
        while (cash > 1000) {
            if (cash > 5_0000) {
                cash *= 0.95;
            } else {
                cash -= 1000;
            }
            times++;
        }
        System.out.println(times);
    }
}
