package com.benkyou.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class CodeQuestion {
    public static void main(String[] args) throws Exception {
        // 1.创建字符输入流 BufferedReader[处理流]
        // 2.使用 Buffered 对象读取 a.txt
        // 3.默认使用 utf-8 编码
        String filePath = "D:\\HSP\\chapter19\\c.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
