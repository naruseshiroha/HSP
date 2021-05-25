package com.benkyou.oop.exercise;

public class VarParameterExercise {
    public static void main(String[] args) {
        String s1 = VarParameterExercise.avgScoreInfo("ZS", 100, 98, 90);
        System.out.println(s1);
        String s2 = VarParameterExercise.avgScoreInfo("LS", 100, 98, 90, 95, 89);
        System.out.println(s2);
    }

    public static String avgScoreInfo(String name, double... scores) {
        // 比 StringBuffer 更安全
        StringBuilder sb = new StringBuilder(name);
        double avg = 0;
        for (double d : scores) {
            avg += d;
        }
        avg /= scores.length;
        sb.append(",avgScore is ").append(avg);
        return sb.toString();
    }
}
