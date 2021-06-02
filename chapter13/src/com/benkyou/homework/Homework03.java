package com.benkyou.homework;

public class Homework03 {
    public static void main(String[] args) {
        String result = formatName("Willian Jefferson Clinton");
        System.out.println(result);
    }

    public static String formatName(String name) {
        if (name == null) {
            throw new RuntimeException("name 不能为 null");
        }
        String[] names = name.split(" ");
        if (names.length != 3) {
            throw new IllegalArgumentException("字符串格式不对");
        }
        return String.format("%s,%s .%s", names[2], names[0], names[1].toUpperCase().charAt(0));
    }
}
