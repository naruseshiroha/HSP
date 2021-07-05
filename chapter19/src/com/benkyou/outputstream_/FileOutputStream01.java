package com.benkyou.outputstream_;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream01 {

    @Test
    // 使用 FileOutPutStream 将数据写到文件中,如果该文件不存在,则创建该文件
    public void writeFile() {
        // 创建 FileOutputStream 对象
        String filePath = "d:\\HSP\\chapter19\\a.txt";
        FileOutputStream fos = null;

        try {
            // 得到 FileOutputStream 对象
            // 1.new FileOutputStream(filePath),写入内容时,会覆盖原来的内容
            // 2.new FileOutputStream(filePath, true),写入内容时,会追加到文件后面
            fos = new FileOutputStream(filePath, true);
            // 写入一个字节
            fos.write('h');
            fos.write('\n');
            // 写入字符串 -> getBytes() 将字符串转成字节数组
            fos.write("Hello World\n".getBytes());
            // write(byte[] b, int off, int len); 将 len 字节从位于偏移量 off 的指定字节数组写入此文件输出流
            fos.write("i love u".getBytes(StandardCharsets.UTF_8), 0, 6);
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
