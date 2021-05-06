package com.benkyou.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AA aa = new AA();
    }
}

class AA {
    private int n2 = getN2();

    {
        System.out.println("AA code block...");
    }

    static {
        System.out.println("AA static code block...");
    }

    // 静态属性的初始化
    private static int n1 = getN1();

    public static int getN1() {
        System.out.println("getN1()...");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2()...");
        return 200;
    }

    public AA() {
        System.out.println("AA constructor");
    }
}
