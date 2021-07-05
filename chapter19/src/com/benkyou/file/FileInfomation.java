package com.benkyou.file;

import java.io.File;

import org.junit.Test;

public class FileInfomation {

    @Test
    // 获取文件信息
    public void info() {
        File file = new File("d:/HSP/chapter19/1.txt");

        String name = file.getName();
        String absolutePath = file.getAbsolutePath();
        String parent = file.getParent();
        long length = file.length(); // 算字节,(utf-8)1个汉字 3个字节
        boolean exists = file.exists();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        System.out.println("name:" + name);
        System.out.println("absolutePath:" + absolutePath);
        System.out.println("parent:" + parent);
        System.out.println("length:" + length);
        System.out.println("exists:" + exists);
        System.out.println("isFile:" + isFile);
        System.out.println("isDirectory:" + isDirectory);
    }
}
