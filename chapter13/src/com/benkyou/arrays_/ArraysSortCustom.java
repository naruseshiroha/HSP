package com.benkyou.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 0, -2, 2};
        System.out.println(Arrays.toString(arr));
//        bubble01(arr);
        bubble02(arr, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble01(int[] arr) {
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

    public static void bubble02(int[] arr, Comparator<Integer> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 数组的排序由 c.compare(arr[j], arr[j + 1]) 决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}
