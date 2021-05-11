package com.benkyou.exercise;

public class BreakExercise {
    public static void main(String[] args) {
        for (int i = 1,sum =0 ; i < 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println(i);
                break;
            }
        }
    }
}
