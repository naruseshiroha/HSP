package com.benkyou.StringBuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        // String -> StringBuffer
        String str = "hello";
        // 1.构造器
        StringBuffer sb = new StringBuffer(str);
        // 2.append()
        StringBuffer sb2 = new StringBuffer();
        sb2.append(str);

        // StringBuffer -> String
        StringBuffer sb3 = new StringBuffer("java");
        // 1.toString()
        String s1 = sb3.toString();
        // 2.构造器
        String s2 = new String(sb3);

    }
}
