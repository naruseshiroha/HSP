package com.benkyou.exercise;

public class WhileExercise {
    public static void main(String[] args) {
        int n = 0;
        while ((n += 3) < 100) {
            System.out.print(n + " ");
        }
        System.out.println();

        int m = 39;
        while (m++ < 200) {
            if ((m & 1) == 0) System.out.print(m + " ");
        }
    }
}
