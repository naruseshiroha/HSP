package com.benkyou.exercise;

import java.util.Arrays;

public class MulForExercise01 {
    public static void main(String[] args) {
        double[][] scores = {
                {12, 13, 67, 78, 99},
                {45, 67, 78, 89,},
                {66, 77, 88, 99, 60, 100},
        };
        double[] avgs = new double[3];
        double allAvg;
        int i = 0;
        double sum = 0;
        int passNum = 0;
        for (double[] sc : scores) {
            sum = 0;
            for (double d : sc) {
                sum += d;
                if (d >= 60) passNum++;
            }
            avgs[i++] = Double.parseDouble(String.format("%.2f", sum / sc.length));
        }
        allAvg = Arrays.stream(avgs).sum() / scores.length;
        System.out.println(Arrays.toString(avgs) + ",allAvg=" + Double.parseDouble(String.format("%.2f", allAvg)));
        System.out.println("passNum=" + passNum);
    }
}
