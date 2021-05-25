package com.benkyou.oop.homework;

public class Homework01 {
    public static void main(String[] args) {
        double[] arr = {1, 1.1, 1.2, 2.1, 2.2, 3.1};
        double max = max(arr);
        System.out.println("max=" + max);
    }

    public static double max(double[] arr) {
        double maxValue = arr[0];
        for (double d : arr) {
            maxValue = maxValue < d ? d : maxValue;
        }
        return maxValue;
    }
}
