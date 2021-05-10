package com.benkyou.exercise;

public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] arr = {4, -1, 9, 10, 23};
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
                index = i + 1;
            }
        }
        System.out.printf("max:%d,index:%d", max, index);
    }
}
