package com.benkyou.throws_;

public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnException.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnException.methodB();
        // "begin A():"
        // "A() finally is executed."
        // "制造异常"
        // "begin B():"
        // "B() finally is executed."
    }
}

class ReturnException {
    static void methodA() {
        try {
            System.out.println("begin A():");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("A() finally is executed.");
        }
    }

    static void methodB() {
        try {
            System.out.println("begin B():");
            return;
        } finally {
            System.out.println("B() finally is executed.");
        }
    }
}
