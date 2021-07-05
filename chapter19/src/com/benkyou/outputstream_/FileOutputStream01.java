package com.benkyou.outputstream_;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream01 {

    @Test
    public void writeFile() {
        String filePath = "d:/a.txt";
        FileOutputStream fos = null;

        try {
            // 1.new FileOutputStream(filePath),写入内容时,会覆盖原来的内容
            // 2.new FileOutputStream(filePath, true),写入内容时,会追加到文件后面
            // fos = new FileOutputStream(filePath);
            fos = new FileOutputStream(filePath, true);
            // 写入一个字节
            // fos.write('0');
            String str = "I Love U";
            // write(byte[] b, int off, int len); 将 len 字节从位于偏移量 off 的指定字节数组写入此文件输出流
            fos.write(str.getBytes(StandardCharsets.UTF_8), 1, 3); // str -> byte[]
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
