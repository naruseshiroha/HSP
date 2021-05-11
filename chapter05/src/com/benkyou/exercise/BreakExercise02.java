package com.benkyou.exercise;

import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i++ < 3) {
            String username = scanner.next();
            String password = scanner.next();
            if (username.equals("admin") && password.equals("admin")) {
                System.out.println("成功");
                break;
            } else {
                if (i != 3) {
                    System.out.printf("您还有%d及机会\n", 3 - i);
                } else {
                    System.out.println("locked 明天再试");
                }
            }
        }
    }
}
