package com.benkyou.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        // System 类的 public static final InputStream in = null;
        // System.in 编译类型 InputStream
        // System.in 运行类型 class java.io.BufferedInputStream
        // 键盘 标准输入
        System.out.println(System.in.getClass());

        // System 类的 public static final PrintStream out = null;
        // System.out 编译类型 PrintStream
        // System.out 运行类型 class java.io.PrintStream
        // 显示器 标准输出
        System.out.println(System.out.getClass());

        System.out.println("hello, PrintStream.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入内容:");
        String content = scanner.next();
        System.out.println("content=" + content);
        scanner.close();
    }
}
