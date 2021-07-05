package com.benkyou.writer_;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileWriter_ {
    @Test
    public void writeFile() {
        String filePath = "d:\\HSP\\chapter19\\b.txt";
        FileWriter fileWriter = null;
        char[] buf = { 'b', 'c', 'd' };

        try {
            fileWriter = new FileWriter(filePath);
            // write(int i); 写入单个字符
            fileWriter.write(97);
            // write(char[] buf); 写入整个字符数组
            fileWriter.write(buf);
            fileWriter.write('\r');
            // write(char[] buf, int off, int len); // 写入指定字符数组的指定部分
            fileWriter.write("hello world".toCharArray(), 6, 5);
            // writer(String s); // 写入整个字符串
            fileWriter.write("\rhello Linux.");
            // write(String[] s, int off, int len); // 写入指定字符串的指定部分
            fileWriter.write("Linux\rhello Linux.", 5, 7);
            // 在数据量大的情况下，可以使用循环操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 需要关闭才能写入到文件
            try {
                // fileWriter.flush();
                fileWriter.close(); // 会执行 flush() + close()
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
