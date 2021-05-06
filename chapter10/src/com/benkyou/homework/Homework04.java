package com.benkyou.homework;

public class Homework04 {
    public static void main(String[] args) {
        new CellPhone().testWork((int n1, int n2) -> {
            int t = n1 * n2;
            System.out.println("res=" + t);
            return t;
        }, 12, 13);
    }
}

interface ICalculate {
    int work(int n1, int n2);
}

class CellPhone {
    public int testWork(ICalculate calculate, int n1, int n2) {
        return calculate.work(n1, n2);
    }
}
