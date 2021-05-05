package com.benkyou.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {

    {
        System.out.println("AAA code block...");
    }

    public AAA() {
        System.out.println("AAA() constructor");
    }
}
class BBB extends AAA {

    {
        System.out.println("BBB code block ...");
    }

    public BBB() {
        // 1.super()
        // 2.调用本类的普通代码块
        System.out.println("BBB() constructor");
    }
}