package com.benkyou.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * 演示 FileInputStream 的使用(字节输入流 文件 -> 程序)
 */
public class FileInputStream_ {

    @Test
    // read() 单个字节读取,效率比较低
    public void readFile01() {
        String filePath = "D:\\HSP\\chapter19\\hello.txt";
        FileInputStream fis = null;
        int readData = 0;
        try {
            // 创建 FileInputStream 对象,用于读取文件
            fis = new FileInputStream(filePath);
            // 从输入流读取一个字节的数据.如果没有输入可用,此方法将阻止,如果返回 -1,表示读取完毕
            while ((readData = fis.read()) != -1) {
                System.out.print((char) readData); // 需要转成 char 显示
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭文件流,释放资源
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    // read(byte[] b)
    public void readFile02() {
        String filePath = "D:\\HSP\\chapter19\\hello.txt";
        FileInputStream fis = null;
        int readLen = 0;
        // 字节数组
        byte[] buf = new byte[8]; // 一次性读取8个字节
        try {
            // 创建 FileInputStream 对象,用于读取文件
            fis = new FileInputStream(filePath);
            // 从输入流读取一个字节的数据.如果没有输入可用,此方法将阻止,如果返回 -1,表示读取完毕
            // read(byte[] b) 返回实际读取的字节数
            while ((readLen = fis.read(buf)) != -1) {
                String s = new String(buf, 0, readLen);
                System.out.print(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭文件流,释放资源
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
