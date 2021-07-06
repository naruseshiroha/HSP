package com.benkyou.outputstream_;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcPath = "D:\\HSP\\chapter19\\demo\\hi\\3.png";
        String destPath = "D:\\HSP\\chapter19\\3.png";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // new BufferedInputStream(InputStream in)
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            // 循环读取,-1 表示读取结束
            byte[] buf = new byte[1024];
            int readLen = 0;
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
