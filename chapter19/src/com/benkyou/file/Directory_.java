package com.benkyou.file;

import java.io.File;

import org.junit.Test;

public class Directory_ {

    @Test
    public void m1() {
        String filePaht = "d:\\HSP\\chapter19\\2.txt";
        File file = new File(filePaht);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("success.");
            } else {
                System.out.println("failed.");
            }
        } else {
            System.out.println("not exists.");
        }
    }

    @Test
    // java 中,目录也被当做文件
    public void m2() {
        String filePaht = "d:\\HSP\\chapter19\\demo";
        File file = new File(filePaht);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("success.");
            } else {
                System.out.println("failed.");
            }
        } else {
            System.out.println("not exists.");
            file.mkdir();
        }
    }

    @Test
    public void m3() {
        String filePaht = "d:\\HSP\\chapter19\\demo\\hi";
        File file = new File(filePaht);
        if (file.exists()) {
            System.out.println("exists.");
        } else {
            // mkdir() 只会创建一级目录
            if (file.mkdirs()) {
                System.out.println("success.");
            } else {
                System.out.println("failed.");
            }
        }
    }
}
