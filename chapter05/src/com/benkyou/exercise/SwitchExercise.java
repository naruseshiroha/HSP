package com.benkyou.exercise;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        switch (c) {
            case 'a', 'b', 'c', 'd', 'e' -> System.out.println((char) (c - 32));
            default -> System.out.println(c);
        }

        double score = scanner.nextDouble();
        if (score > 100 || score < 0) {
            System.out.println("error");
            return;
        }
        switch ((int) (score / 60)) {
            case 1 -> System.out.println("合格");
            case 0 -> System.out.println("不合格");
        }

        int m = scanner.nextInt();
        switch (m) {
            case 3, 4, 5 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("夏季");
            case 9, 10, 11 -> System.out.println("秋季");
            case 12, 1, 2 -> System.out.println("冬季");
            default -> System.out.println("error");
        }

    }
}
