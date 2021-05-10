package com.benkyou.array_;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        // 二维数组的每个元素是一维数组
        int[][] arr = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 2, 0, 3, 0},
                {0, 0, 0, 0, 0},
        };
        System.out.println(arr[2][3]); // 3

        for (int[] array : arr) {
            for (int n : array) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
