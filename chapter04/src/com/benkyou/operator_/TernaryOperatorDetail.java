package com.benkyou.operator_;

public class TernaryOperatorDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // d = c ? a : b
        // 表达式1和表达式2要为可以赋给接受变量的类型(或可以紫红转换/或者强制转换)
        int a = 3;
        int b = 8;
        int c = a > b ? (int) 1.1 : (int) .2; // 0
        double d = a > b ? a : b + 3; // 11.0
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }
}
