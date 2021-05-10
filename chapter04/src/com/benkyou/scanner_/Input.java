package com.benkyou.scanner_;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入名字：");
        String name = scanner.next();
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入工资：");
        double salary = scanner.nextDouble();
        System.out.printf("name:%s,age:%d,salary:%.2f\n",name,age,salary);

    }
}
