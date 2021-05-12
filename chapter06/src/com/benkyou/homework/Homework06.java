package com.benkyou.homework;

public class Homework06 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        char[] arr = {'a', 'z', 'b', 'c',};
        char[] brr = arr;
        arr[2] = 'd';
        for (int i = 0; i < brr.length; i++) {
            System.out.println(arr[i] + "," + brr[i]);
        }
    }
}
