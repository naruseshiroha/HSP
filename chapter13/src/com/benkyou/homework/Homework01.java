package com.benkyou.homework;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str);
        str = reverse(str, 1, 6);
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {

        // 对输入的参数做一个验证
        // (1) 写出正确的情况
        // (2) 然后取反
        if (!(str != null && start >= 0 && end > start && end <= str.length())) {
            throw new RuntimeException("参数不正确");
        }
        byte[] values = str.getBytes();
        byte t;
        for (int i = start; i < end; end--) {
            t = values[i];
            values[i++] = values[end - 1];
            values[end - 1] = t;
        }
        return new String(values);
    }
}
