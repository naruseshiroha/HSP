package com.benkyou.array_;

public class TwoDimensionalArray04 {
    public static void main(String[] args) {
        // 静态初始化
        int[][] arr = {{1}, {2, 2,}, {3, 3, 3}};
        for (int[] brr : arr) {
            for (int i : brr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
