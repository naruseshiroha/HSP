package com.benkyou.operator_;

public class InverseOperator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // ! : 取反
        boolean b2 = 1 > 2; // F
        b2 = !b2; // T
        System.out.println(b2);

        // ^ : 当 a 和 b 不同时,则结果为 true,否则为 false
        // 1001 ^ 0100 = 1101
        boolean b = 1 > 2 ^ 3 > 2;
        System.out.println(b);
    }
}
