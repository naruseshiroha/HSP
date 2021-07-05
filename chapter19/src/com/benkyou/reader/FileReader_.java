package com.benkyou.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class FileReader_ {

    @Test
    // 单个字符读取 read()
    public void readFile01() {
        String filePath = "d:\\HSP\\chapter19\\a.txt";
        FileReader fileReader = null;
        int data = 0;
        // 1.创建 FileRead 对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    // 字符数组读取文件 read(char[] cbuf)
    public void readFile02() {
        String filePath = "d:\\HSP\\chapter19\\a.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] cbuf = new char[8];

        // 1.创建 FileRead 对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取 使用 read(), 单个字符读取
            while ((readLen = fileReader.read(cbuf)) != -1) {
                System.out.print(new String(cbuf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
