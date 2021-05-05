package com.benkyou.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
//        String s = "12345";
        String s = "12-45";
        int num = Integer.parseInt(s);// NumberFormatException
        System.out.println(num);
    }
}
