package com.benkyou.exercise;

import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        do {
            System.out.println("Q:还钱吗? Y/N");
            c = scanner.next().charAt(0);
            if (c == 'n' || c == 'N') System.out.println("pia pia pia");
        } while (!(c == 'Y' || c == 'y'));
    }
}
