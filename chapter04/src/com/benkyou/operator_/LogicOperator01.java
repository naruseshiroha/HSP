package com.benkyou.operator_;

public class LogicOperator01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // && 和 &
        int age = 50;
        if (age > 20 && age < 90) {
            System.out.println("ok100");
        }

        if (age > 20 & age < 90) {
            System.out.println("ok200");
        }

        int a = 4;
        int b = 9;
        // 对于 && 而言,如果第一个条件为 false,后面的条件不再判断
        // 对于 & 而言,如果第一个条件为 false,后面的条件仍然会判断
        if (a < 1 & ++b < 50) {
            System.out.println("ok300");
        }

        System.out.printf("a=%d,b=%d\n", a, b); // 4 10
    }
}
