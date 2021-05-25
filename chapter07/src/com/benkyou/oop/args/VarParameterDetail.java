package com.benkyou.oop.args;

public class VarParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // 可变参数的实参可以为数组
        f1(arr); // 3
    }

    // public static void f1(int... args, int n2) { 可变参数和普通参数一起时,必须放在最后
    // public static void f1(int... args, int... args2) { 只能出现一个可变参数
    public static void f1(int... args) {
        System.out.println("args length is " + args.length);
    }
}


