package com.benkyou.oop.exercise;

public class RecursionExercise01 {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(monkeyEatPeach(10));
    }

    public static long fibonacci(int n) {
        if (n < 3) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static int monkeyEatPeach(int n) {
        if (n == 1) return 1;
        return (monkeyEatPeach(n - 1) + 1) * 2;
    }


    public int peach(int day) {
        if(day == 10) {//第 10 天，只有 1 个桃
            return 1;
        } else if ( day >= 1 && day <=9 ) {
            return (peach(day + 1) + 1) * 2;//规则，自己要想
        } else {
            System.out.println("day 在 1-10");
            return -1;
        }
    }
}
