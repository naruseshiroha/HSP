package com.benkyou.homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String password = scanner.next();
        String email = scanner.next();
        if (validateName(name) && validatePassword(password) && validateEmail(email)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean validateName(String name) {
        return name.length() >= 2 & name.length() <= 4;
    }

    public static boolean validatePassword(String password) {
        if (!(password.length() == 6)) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isDigit(password.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateEmail(String email) {
        int i1 = email.lastIndexOf("@");
        int i2 = email.lastIndexOf(".");
        return i1 > 0 && i2 > i1;
    }
}
