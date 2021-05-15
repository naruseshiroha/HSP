package com.benkyou.writer_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "d:/b.txt";
        FileWriter fileWriter = null;
        char[] buf = {'b','c','d'};

        try {
            fileWriter = new FileWriter(filePath);
            // write(int i); 写入单个字符
            fileWriter.write(97);
            // write(char[] buf); 写入整个字符数组
            fileWriter.write(buf);
            fileWriter.write('\r');
            // write(char[] buf, int off, int len); // 写入指定字符数组的指定部分
            fileWriter.write("hello world".toCharArray(),6,5);
            // writer(String s); // 写入整个字符串
            fileWriter.write("\rhello Linux.");
            // write(String[] s, int off, int len); // 写入指定字符串的指定部分
            fileWriter.write("Linux\rhello Linux.",5,7);
            // 需要关闭才能写入到文件
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
//                fileWriter.close(); // 会先执行 flush()
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
