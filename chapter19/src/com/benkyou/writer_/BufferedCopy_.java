package com.benkyou.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        // 1.BufferedReader 和 BufferedWriter 是按照字符操作
        // 2.不要去操作 二进制文件[音频,视频,doc,pdf],可能造成文件损坏
        String srcPath = "D:\\HSP\\chapter19\\c.txt";
        String destPath = "D:\\HSP\\chapter19\\c_copy.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        try {
            br = new BufferedReader(new FileReader(srcPath));
            bw = new BufferedWriter(new FileWriter(destPath));
            // 读取一行内容,但是没有换行
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
