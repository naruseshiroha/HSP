package com.benkyou.extend_.improve_;

/*
 1.提高代码的复用性
 2.提高代码的扩展性和维护性
 */
public class Graduate extends Student {

    public Graduate() {
    }

    public Graduate(String name, int age, double score) {
        super(name, age, score);
    }

    public void testing() {
        System.out.printf("大学生 %s 正在考大学数学.\n", name);
    }
}
