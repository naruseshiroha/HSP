package com.benkyou.exercise;

public class ArithmeticOperatorExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int i = 1;
        i = i++; // 规则使用临时变量: 1) temp=i; i=i+1; i=temp;
        System.out.println(i); // 1

        int j = 1;
        j = ++j; // 规则使用临时变量: 1) i=i+1; temp=i; i=temp;
        System.out.println(j); // 2

        int k = 10;
        int l = 20;
        int m = k++; // m=10; k=11;
        System.out.println("m=" + m); // 10
        System.out.println("l=" + l); // 20
        m = --l; // 19
        System.out.println("m=" + m); // 19
        System.out.println("l=" + l); // 19
    }
}
