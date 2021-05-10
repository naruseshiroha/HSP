package com.benkyou.operator_;

public class ArithmeticOperator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int n = 10 / 4; // int 2
        double d = 10.0 / 4; // double 2.5
        double d1 = 10 / 4; // int -> double 2.0

        // % 的本质, a % b = a - a / b * b
        // a 是小数时, a % b = a - (int)a / b * b;
        // -10 % 3 => -10 - (-10)/(3) * 3 = -1
        // 10 % -3 => 10 - 10/(-3) * (-3) = 1
        // -10 % -3 => -10 - (-10)/(-3) * (-3) = -1
        System.out.println(-10 % 3); // -1
        System.out.println(-10 % -3); // -1
        System.out.println(10 % -3); // 1

        /**
         * ++的使用
         * 前++: ++i 先自增后赋值
         * 后++: i++ 先赋值后自增
         */
        int j = 10;
//        int k = ++j; // j = j + 1; k = j;
        int k = j++; // k = j; j = j + 1;
        System.out.println("k=" + k + ",j=" + j);

    }
}
