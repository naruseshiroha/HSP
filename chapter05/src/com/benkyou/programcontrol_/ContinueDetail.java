package com.benkyou.programcontrol_;

public class ContinueDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        inner:
        for (int i = 0; i < 4; i++) {
            outer:
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    //continue; // !(j=2)
                    //continue outer; // !(j=2)
                    continue inner; // 0 1
                }
                System.out.println("j=" + j);
            }
        }
    }
}
