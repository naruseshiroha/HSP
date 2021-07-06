package com.benkyou.printstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws Exception {
        // PrintWriter pw = new PrintWriter(System.out); // 打印到显示器
        FileWriter fileWriter = new FileWriter("D:\\HSP\\chapter19\\e.txt");
        PrintWriter pw = new PrintWriter(fileWriter);
        pw.write("我爱你\ri love u\r愛してる"); // System.out 只打印一行
        // 必须 close 才能写入到文件
        pw.close();
    }
}
