package com.benkyou.exception_;

public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]); // i=2 ArrayIndexOutOfBoundsException
        }
    }
}
