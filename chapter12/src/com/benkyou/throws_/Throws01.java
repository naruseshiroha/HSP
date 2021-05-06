package com.benkyou.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }

    public void m1() throws FileNotFoundException {
        // 创建一个文件流对象
        // 1.FileNotFoundException
        // 2.try-catch-finally
        // 3.throws
        // 4.throws 后面的异常类型可以是方法中产生的异常类型,也可以是它的父类
        // 5.throws 关键字后也可以是 异常列表,使用 ',' 隔开
        FileInputStream fis = null;
        fis = new FileInputStream("D:\\Administrator\\Pictures\\avatar1.jpg");
    }
}
