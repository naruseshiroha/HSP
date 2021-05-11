package com.benkyou.exercise;

public class ForExercise {
    public static void main(String[] args) {
        int j = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                sum += i;
                j++;
            }
        }
        System.out.printf("number:%d,total:%d", j, sum);
    }
}
