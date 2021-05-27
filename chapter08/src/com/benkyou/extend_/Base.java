package com.benkyou.extend_;

public class Base extends TopBase {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
    }

    public Base(String name, int age) {
        // super();
        System.out.println("Base(String, int) is called.");
    }

    public Base(String name) {
        System.out.println("Base(String) is called.");
    }

    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100()...");
    }

    public void test200() {
        System.out.println("test200()...");
    }

    public void test300() {
        System.out.println("test300()...");
    }

    public void test400() {
        System.out.println("test400()...");
    }

    // call
    public void callTest400() {
        test400();
    }

}
