package com.benkyou.outputstream_;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcPath = "D:/c.txt";
        String destPath = "D:/d.txt";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        String line;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            byte[] buf = new byte[1024];
            int readLen = 0;
            // 读取一行内容,但是没有换行
            while ((readLen = bis.read(buf)) != -1) {
                bos.write(buf, 0, readLen);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
