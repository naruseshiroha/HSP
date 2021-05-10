package com.benkyou.binary_;

public class BinaryTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int n1 = 0B1010; // 10
        int n2 = 1010; // 1010
        int n3 = 0_1010; // 520
        int n4 = 0X1010; // 4122
        System.out.printf("n1:%d,n2:%d,n3:%d,n4:%d.",n1,n2,n3,n4);
    }
}
