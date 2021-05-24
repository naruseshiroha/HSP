package com.benkyou.oop.exercise;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA aa = new AA();
        int n = 3;
        System.out.println(n + " is odd?" + aa.isOdd(n));

        aa.print(4,4);
    }
}


class AA {
    public boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public void print(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}