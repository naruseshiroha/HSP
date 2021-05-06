package com.benkyou.innerclass_.exercise;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
//        cellPhone.alarmClock(new IBell() {
//            @Override
//            public void ring() {
//                System.out.println("小伙伴上课了.");
//            }
//        });
        cellPhone.alarmClock(() -> System.out.println("小伙伴上课了"));
    }
}

interface IBell {
    void ring();
}

class CellPhone {
    public void alarmClock(IBell bell) {
        bell.ring();
    }
}
