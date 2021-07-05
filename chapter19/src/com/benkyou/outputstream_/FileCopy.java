package com.benkyou.outputstream_;

import java.io.*;

import org.junit.Test;

public class FileCopy {

    @Test
    public void copy() {
        String srcFilePath = "D:\\sora\\Pictures\\3.png";
        String destFilePath = "D:\\HSP\\chapter19\\1.png";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(srcFilePath);
            fos = new FileOutputStream(destFilePath);
            // 定义一个字节数组,提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fis.read(buf)) != -1) {
                // 读取到后,就写入到文件 通过 FileOutputStream
                // 一边读一边写
                fos.write(buf, 0, readLen);
            }
            System.out.println("copy success.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
