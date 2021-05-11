package com.benkyou.array_;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // 先声明数组,再 new 分配空间
//        double[] scores;
//        scores = new double[5];
        // 动态分配
        double[] scores = new double[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextDouble();
        }

        for (double d :scores) {
            System.out.println(d);
        }


    }
}
