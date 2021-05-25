package com.benkyou.oop.homework;

public class Homework02 {
    public static void main(String[] args) {
        String[] arr = {"i", "l", "o", "v", "e", "u"};
        int index = find(arr, "u");
        System.out.println(index);
    }

    public static int find(String[] arr, String str) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                return i;
            }
        }
        return index;
    }
}

