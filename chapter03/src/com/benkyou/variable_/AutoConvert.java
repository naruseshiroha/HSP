package com.benkyou.variable_;

public class AutoConvert {
    public static void main(String[] args) {
        // char -> int -> long -> float -> double
        // byte -> short -> int -> long -> float -> double
        int a = 'c';
        byte b = 127;
        double d = b + a;
    }
}
