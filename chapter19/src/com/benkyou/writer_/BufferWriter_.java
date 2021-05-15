package com.benkyou.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:/c.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello BufferWriter");
        bufferedWriter.newLine(); // 插入一个和系统相关的换行
        bufferedWriter.close();
    }
}
