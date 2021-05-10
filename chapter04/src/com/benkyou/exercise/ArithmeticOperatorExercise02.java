package com.benkyou.exercise;

public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.printf("%d天,合%d个星期零%d天\n", days, weeks, leftDays);

        double hsd = 133.5;
        double ssd = 5 / 9.0 * (hsd - 100);
        System.out.printf("华氏温度%.2f对应的摄氏温度=%.2f", hsd, ssd);
    }
}
