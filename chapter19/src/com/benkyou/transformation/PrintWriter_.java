package com.benkyou.transformation;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("d:/e.txt");
        PrintWriter pw = new PrintWriter(fileWriter);
        pw.write("我爱你\ri love u\r愛してる");
        pw.close();
    }
}
