package com.benkyou.oop.args;

public class VarParameter01 {
    public static void main(String[] args) {
        int res = MyMethod.add(1, 2, 3, 4);
        System.out.println(res);
    }
}

class MyMethod {
    // 功能相同,参数个数不同 -> 使用可变参数优化
    // 1.int.. 表示接收的是可变参数,类型是 int,可以接收(0-n)个
    // 2.使用可变参数时,可以当作数组来使用,即 args 可以当作数组
    // 3.便利 args 求和即可
    public static int add(int n1, int... args) {
        int res = n1;
        for (int n : args) {
            res += n;
        }
        return res;
    }
}