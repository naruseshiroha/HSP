package com.benkyou.programcontrol_;

public class Break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) break;
            System.out.println("i=" + i);
        }
    }
}
