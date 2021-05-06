package com.benkyou.enum_.exercise;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy);
    }
}

enum Gender {
    BOY,GIRL
}