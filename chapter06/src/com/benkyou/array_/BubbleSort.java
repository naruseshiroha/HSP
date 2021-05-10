package com.benkyou.array_;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        bubble(arr);
        System.out.println(Arrays.toString(arr)); // [13, 24, 57, 69, 80]
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
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
