package com.benkyou.exercise;

public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] ch = new char[26];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) ('A' + i); // 'A'+i int, int -> (char)
        }

        for (char c : ch) {
            System.out.print(c + " ");
        }

    }
}
