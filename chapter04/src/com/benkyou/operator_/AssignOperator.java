package com.benkyou.operator_;

public class AssignOperator {
    public static void main(String[] args) {
        int n = 10;
        n += 4; // 14
        System.out.println(n);

        n /= 3; // 4
        System.out.println(n);

        // 复合赋值运算符会进行类型转换
        byte b = 3;
        b += 2; // => (byte)(b + 2) = 5
        b++; // => (byte)(b + 1) = 6
        System.out.println(b);

    }
}
