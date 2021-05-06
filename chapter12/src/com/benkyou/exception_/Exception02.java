package com.benkyou.exception_;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) {
        FileInputStream fis;
        try {
            fis = new FileInputStream("D:\\Administrator\\Pictures\\avatar1.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.print(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
