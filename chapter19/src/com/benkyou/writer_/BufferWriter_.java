package com.benkyou.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\HSP\\chapter19\\c.txt";
        // 创建 BufferedWriter, new FileWriter(filePath, true) 表示以追加的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hello BufferWriter.包装流");
        bufferedWriter.newLine(); // 插入一个和系统相关的换行
        bufferedWriter.close();
    }
}
