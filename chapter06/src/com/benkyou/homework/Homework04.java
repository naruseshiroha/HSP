package com.benkyou.homework;

import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int[] brr = insertToArray(arr, 1);
        System.out.println(Arrays.toString(brr));
    }

    public static int[] insertToArray(int[] arr, int value) {
        int[] brr = new int[arr.length + 1];
        int index = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (value < arr[i]) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            System.arraycopy(arr, 0, brr, 0, index);
        }
        if (index != arr.length) {
            System.arraycopy(arr, index, brr, index + 1, arr.length - index);
        }
        brr[index] = value;
        return brr;
    }
}
