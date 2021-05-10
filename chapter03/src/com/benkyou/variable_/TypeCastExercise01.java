package com.benkyou.variable_;

public class TypeCastExercise01 {
    public static void main(String[] args) {
        short s = 12;
//        s = s - 9; // int -> short F

        byte b = 10;
        b = (byte) (b + 11); // T

        char c = 'a';
        int n = 16;
        float f = .125F;
        double d = c + n + f; // T

        byte b2 = 16;
        short s2 = 14;
//        short s3 = b2 + s2;// int -> short F
    }
}
