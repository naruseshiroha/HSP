package com.benkyou.variable_;

public class ForceConvert {
    public static void main(String[] args) {
        int i = (int) 1.9; // 1
        int j = 128;
        byte b = (byte) j; // -128
        System.out.println(b);
    }
}
