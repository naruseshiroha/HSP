package com.benkyou.homework;

import java.util.Arrays;

public class Homework07 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 0, -2, 3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    @SuppressWarnings("all")
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}
