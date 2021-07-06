package com.benkyou.properties_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {

        // 使用 properties 类来创建 配置文件,修改配置文件内容
        Properties properties = new Properties();
        // 创建
        // 1.如果该文件没有 key,就是创建
        // 2.如果该文件有 key,就是修改
        // class Properties extends Hashtable<Object,Object>
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "汤姆");
        properties.setProperty("password", "666666");
        // 将 K-V 存储到文件中即可 new FileOutputStream() 中文是 Unicode 码值
        // properties.store(new FileOutputStream("src/mysql2.properties"), null);
        properties.store(new FileWriter("src/mysql2.properties"), null);
        System.out.println("success");
    }
}
