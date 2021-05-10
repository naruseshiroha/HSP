package com.benkyou.exercise;

public class TernaryOperatorExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int a = 123;
        int b = 234;
        int c = 135;
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("max=" + max);
    }
}
