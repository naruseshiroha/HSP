package com.benkyou.exercise;

public class DoWhileExercise01 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
        } while (i++ < 100);
        System.out.println();

        int j = 1, sum = 0;
        do {
            sum += j;
        } while (j++ < 100);
        System.out.println(sum);

        int k = 1, count = 0;
        do {
            if (k % 5 == 0 && k % 3 != 0) {
                System.out.print(k + " ");
                count++;
            }
        } while (k++ < 200);
        System.out.println();
        System.out.println(count);
    }
}
