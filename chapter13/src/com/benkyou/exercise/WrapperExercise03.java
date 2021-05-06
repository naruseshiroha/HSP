package com.benkyou.exercise;

public class WrapperExercise03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); // false

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4); // false

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5==i6); // true

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7==i8); // false

        Integer i9 = new Integer(127);
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        Integer i12 = new Integer(127);
        Integer i13 = new Integer(127);
        Integer i14 = new Integer(127);
    }
}
