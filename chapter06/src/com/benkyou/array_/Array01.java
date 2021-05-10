package com.benkyou.array_;

public class Array01 {
    public static void main(String[] args) {
        double[] hens = {3, 5, 1, 3.4, 7.8, .125};
        double sum = 0;
        for (double d : hens) {
            sum += d;
        }
        System.out.printf("total:%.2f,avg:%.2f", sum, sum / hens.length);
    }
}
