package com.benkyou.homework;

public class Homework02 {
    public static void main(String[] args) {
        int num;
        for (int i = 0; i < 2; i++) {
            num = Frock.getNextNum();
            System.out.println(num);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(new Frock().getSerialNumber());
        }
    }
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber; // 序列号

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        return currentNum += 100;
    }
}
