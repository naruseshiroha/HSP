package com.benkyou.oop.homework;

import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] brr = copyArr(arr);
        System.out.println(Arrays.toString(brr));
    }

    public static int[] copyArr(int[] arr) {
        int[] brr = new int[arr.length];
        System.arraycopy(arr,0,brr,0,arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            brr[i] = arr[i];
//        }
        return brr;
    }
}
