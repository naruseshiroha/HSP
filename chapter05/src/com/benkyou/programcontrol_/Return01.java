package com.benkyou.programcontrol_;

public class Return01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("i=" + i);
//                return;
//                break;
                continue;
            }
            System.out.println("hi");
        }

    }
}
