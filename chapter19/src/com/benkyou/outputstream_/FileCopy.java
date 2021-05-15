package com.benkyou.outputstream_;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "D:\\sora\\Pictures\\3.png";
        String destFilePath = "D:\\1.png";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(srcFilePath);
            fos = new FileOutputStream(destFilePath);
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fis.read(buf)) != -1) {
                fos.write(buf, 0, readLen);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
