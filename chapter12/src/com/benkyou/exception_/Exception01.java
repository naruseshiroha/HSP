package com.benkyou.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b; // java.lang.ArithmeticException: / by zero
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(c);
    }
}
