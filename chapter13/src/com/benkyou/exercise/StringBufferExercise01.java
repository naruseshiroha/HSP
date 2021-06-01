package com.benkyou.exercise;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb); // 调用 AbstractStringBuilder 的 appendNull
        System.out.println(sb.length()); // 4
        System.out.println(sb); // null

        StringBuffer sb1 = new StringBuffer(str); // super(str.length + 16); // NullPointerException
        System.out.println(sb1);

    }
}
