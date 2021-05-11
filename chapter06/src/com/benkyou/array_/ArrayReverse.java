package com.benkyou.array_;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse2(arr)));
    }

    public static int[] reverse(int[] arr) {
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        return arr;
    }

    public static int[] reverse2(int[] arr) {
        int[] brr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            brr[j] = arr[i];
        }
        arr = brr;
        return arr;
    }
}
