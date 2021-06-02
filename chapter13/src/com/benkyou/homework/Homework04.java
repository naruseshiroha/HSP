package com.benkyou.homework;

public class Homework04 {
    public static void main(String[] args) {
        statistics("I Love U 5201314 .");
    }

    public static void statistics(String s) {
        int upper = 0;
        int lower = 0;
        int digital = 0;
        char[] values = s.toCharArray();
        for (char c : values) {
            if (Character.isDigit(c)) {
                digital++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            } else if (Character.isUpperCase(c)) {
                upper++;
            }
        }
        System.out.printf("upper:%d,lower:%d,digital:%d.\n", upper, lower, digital);
    }
}
