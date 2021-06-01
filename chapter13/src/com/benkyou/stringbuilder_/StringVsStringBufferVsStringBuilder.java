package com.benkyou.stringbuilder_;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String text = "";
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String spends time:" + (end1 - begin1));

        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("stringBuffer spends time:" + (end2 - begin2));

        long begin3 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("stringBuilder spends time:" + (end3 - begin3));
    }
}
