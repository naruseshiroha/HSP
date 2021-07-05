package com.benkyou.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileCreate {
    @Test
    // new File(String pathname)
    public void createFile01() {
        String filePath = "D:/HSP/chapter19/1.txt";
        File file = new File(filePath);

        try {
            // createNewFile() 才会真正的在磁盘创建文件
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    // new File(File parent, String child)
    public void createFile02() {
        File parent = new File("D:/HSP/chapter19/");
        String child = "2.txt";

        File file = new File(parent, child);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    // new File(String parent, String child)
    public void createFile03() {
        String parent = "D:/HSP/chapter19/";
        String child = "3.txt";

        File file = new File(parent, child);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
