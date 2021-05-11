package com.benkyou.array_;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3}; 拷贝到 brr, 值拷贝
        int[] arr = {1, 2, 3};

        int[] brr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            brr[i] = arr[i];
//        }
        System.arraycopy(arr, 0, brr, 0, arr.length);

        arr[1] = 10;
        System.out.println(Arrays.toString(brr)); // {1,2,3}
    }
}
