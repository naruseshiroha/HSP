package com.benkyou.homework;

import java.util.Arrays;
import java.util.Random;

public class Homework05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int max = 0;
        int max_index = 0;
        boolean hasEight = false;
        double avg = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100) + 1;
            avg += arr[i];
            if (arr[i] == 8) {
                hasEight = true;
            }
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            }
        }
        avg /= 10.0;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("avg=" + avg);
        System.out.println("max=" + max);
        System.out.println("max_index=" + max_index);
        System.out.println("hasEight=" + hasEight);
    }
}
