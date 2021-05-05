package com.benkyou.exercise;

public class Homework02 {
    public static void main(String[] args) {
        if (args[4].equals("john")){ // 可能发生 ArrayIndexOutOfBoundException
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];
        Integer i = (Integer) o; // 一定发生 ClassCastException
    }
}
