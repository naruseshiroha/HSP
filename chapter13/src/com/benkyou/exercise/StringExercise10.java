package com.benkyou.exercise;

public class StringExercise10 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public static void main(String[] args) {
        StringExercise10 ex = new StringExercise10();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);

    }

    public void change(String str, char[] ch) {
        str = "java";
        ch[3] = '_';
    }
}
