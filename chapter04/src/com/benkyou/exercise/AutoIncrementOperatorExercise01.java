package com.benkyou.exercise;

@SuppressWarnings("all")
public class AutoIncrementOperatorExercise01 {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
    }

    public static void f1() {
        int x = 5, y = 5;
        if (x++ == 6 & ++y == 6) {
            x = 11;
        }
        System.out.printf("f1() x=%d,y=%d.\n", x, y); // 6 6
    }

    public static void f2() {
        int x = 5, y = 5;
        if (x++ == 6 && ++y == 6) {
            x = 11;
        }
        System.out.printf("f2() x=%d,y=%d.\n", x, y); // 6 5
    }

    public static void f3() {
        int x = 5, y = 5;
        if (x++ == 5 | ++y == 5) {
            x = 11;
        }
        System.out.printf("f3() x=%d,y=%d.\n", x, y); // 11 6
    }

    public static void f4() {
        int x = 5, y = 5;
        if (x++ == 5 || ++y == 5) {
            x = 11;
        }
        System.out.printf("f4() x=%d,y=%d.\n", x, y); // 11 5
    }

    public static void f5() {
        boolean x = true;
        boolean y = false;
        short z = 46;
        if ((z++ == 46) && (y = true)) z++; // 48
        if ((x = false) || (++z == 49)) z++; // 50
        System.out.println("z=" + z);

    }
}
