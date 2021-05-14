package com.benkyou.array_;

public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[1][1] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d]=%d ",i,j,arr[i][j]);
            }
            System.out.println();
        }
    }
}
