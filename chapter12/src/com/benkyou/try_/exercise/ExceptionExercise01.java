package com.benkyou.try_.exercise;

public class ExceptionExercise01 {
    public static void main(String[] args) {
        System.out.printf("m1():%d \n", m1());
        System.out.printf("m2():%d \n", m2());
        System.out.printf("m3():%d \n", m3());
    }

    public static int m1() {
        try {
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "Jack";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static int m2() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "Jack";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;
        } finally {
            return ++i;
        }
    }

    public static int m3() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "Jack";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i; // 保存临时变量 temp = 3, 执行完所有代码再返回
        } finally {
            ++i;
            System.out.println("i=" + i);
        }
    }
}
