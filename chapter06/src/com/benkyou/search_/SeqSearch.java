package com.benkyou.search_;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        String[] name = {"Key", "Seem", "August", "Alice"};
        Scanner scanner = new Scanner(System.in);

        int index = -1;
        String value = scanner.next();
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(value)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("index=" + index);
        } else {
            System.out.println("sorry, can't find");
        }
    }
}
