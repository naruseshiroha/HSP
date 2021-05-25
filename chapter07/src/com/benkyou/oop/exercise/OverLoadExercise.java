package com.benkyou.oop.exercise;

public class OverLoadExercise {
    public static void main(String[] args) {
        m(2);
        m(3, 4);
        m("520");

        int m1 = Methods.max(1, 12);
        double m2 = Methods.max(1.2, 1.1);
        double m3 = Methods.max(97d, 97, 'a');
        System.out.printf("%d, %f, %f", m1, m2, m3);

    }

    public static int m(int n) {
        int res = n * n;
        System.out.println(res);
        return res;
    }

    public static int m(int n1, int n2) {
        int res = n1 * n2;
        System.out.println(res);
        return res;
    }

    public static String m(String s) {
        System.out.println(s);
        return s;
    }
}

@SuppressWarnings("all")
class Methods {
    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }


    public static double max(double n1, double n2, double n3) {
        return n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
    }
}
