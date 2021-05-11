package com.benkyou.programcontrol_;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        switch (c) {
            // -> case 'a': System.out.println("1"); break;
            case 'a' -> System.out.println("1");
            case 'b' -> System.out.println("2");
            case 'c' -> System.out.println("3");
            case 'd' -> System.out.println("4");
            case 'e' -> System.out.println("5");
            case 'f' -> System.out.println("6");
            case 'g' -> System.out.println("7");
            default -> System.out.println("error");
        }
    }
}
