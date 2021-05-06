package com.benkyou.innerclass_;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 200;

    public void m1() {
        System.out.println("m1().");
    }

    public Outer(int n1) {
        this.n1 = n1;
    }

    {
        System.out.println("code block.");
    }

    class inner {

    }
}
