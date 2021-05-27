package com.benkyou.extend_.improve_;

public class Pupil extends Student {
    public Pupil() {
    }

    public Pupil(String name, int age, double score) {
        super(name, age, score);
    }

    public void testing() {
        System.out.printf("小学生 %s 正在考数学.\n", name);
    }
}
