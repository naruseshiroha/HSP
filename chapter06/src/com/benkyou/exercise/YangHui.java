package com.benkyou.exercise;

public class YangHui {
    public static void main(String[] args) {
        int[][] yh = new int[10][];
        for (int i = 0; i < yh.length; i++) {
            yh[i] = new int[i + 1];
            for (int j = 0; j < yh[i].length; j++) {
                if (j == 0 || j == yh[i].length - 1) {
                    yh[i][j] = 1;
                } else {
                    yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
                }
            }
        }

        for (int[] arr : yh) {
            for (int b : arr) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
