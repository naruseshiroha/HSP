package com.benkyou.oop.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Tom.start();
    }
}

class Tom {
    private static int num;

    public static int comGuess() {
        return new Random().nextInt(3);
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int tomGuess;
        for (int i = 0; i < 3; i++) {
            tomGuess = scanner.nextInt(); // 0-1
            int comGuess = comGuess();
            Boolean flag = judge(tomGuess, comGuess);
            if (flag != null) {
                num = flag ? ++num : --num;
            }
        }
        showResult(num);
    }

    public static Boolean judge(int tom, int com) {
        if (tom == 0) {
            if (com == 1) {
                return true;
            } else if (com == 2) {
                return false;
            } else {
                return null;
            }
        } else if (tom == 1) {
            if (com == 2) {
                return true;
            } else if (com == 0) {
                return false;
            } else {
                return null;
            }
        } else {
            if (com == 0) {
                return true;
            } else if (com == 1) {
                return false;
            } else {
                return null;
            }
        }
    }

    public static void showResult(int num) {
        if (num > 0) {
            System.out.println("win" + num + "局");
        } else if (num == 0) {
            System.out.println("平局");
        } else {
            System.out.println("lose");
        }
    }
}