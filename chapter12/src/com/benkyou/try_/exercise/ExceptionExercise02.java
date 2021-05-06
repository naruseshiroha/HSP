package com.benkyou.try_.exercise;

import java.util.Scanner;

public class ExceptionExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            inputStr = scanner.next();
            System.out.print("请输入一个整数:");
            try {
                num = Integer.parseInt(inputStr);
                System.out.println("num=" + num);
                break;
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.out.println("输入的不是整数,请重新输入");
            }
        }
    }
}
