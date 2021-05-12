package com.benkyou.array_;

public class TwoDimensionalArray05 {
    public static void main(String[] args) {
        // 静态初始化
        int[][] arr = {{4, 6}, {1, 4, 5, 7,}, {-2}};
        int sum = 0;
        for (int[] brr : arr) {
            for (int i : brr) {
                sum += i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
