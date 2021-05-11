package com.benkyou.programcontrol_;

public class Break02 {
    public static void main(String[] args) {
        inner:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 3) break inner;
                System.out.printf("i=%d,j=%d\n", i, j);
            }
        }
    }
}
