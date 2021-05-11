package com.benkyou.array_;

import java.util.Arrays;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = i+1;
//            }
            Arrays.fill(arr[i], i + 1);
        }

        for (int[] brr : arr) {
            for (int n : brr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
