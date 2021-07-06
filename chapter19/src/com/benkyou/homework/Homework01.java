package com.benkyou.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.benkyou.writer_.BufferWriter_;

public class Homework01 {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\HSP\\chapter19\\demo\\mytemp";
        File file = new File(filePath);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("created mytemp");
            } else {
                System.out.println("mytemp is exists");
            }
        }

        String child = "\\hello.txt";
        File newFile = new File(file, child);
        if (!newFile.exists()) {
            if (newFile.createNewFile()) {
                System.out.println("created hello.txt");

                BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
                bw.write("hello world!");
                bw.close();
            } else {
                System.out.println("hello.txt is exists");
            }
        }
    }
}
