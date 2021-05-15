package com.benkyou.properties_;

import java.io.FileOutputStream;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "Tom");
        properties.setProperty("password", "888888");
        properties.store(new FileOutputStream("src/mysql2.properties"), null);
        System.out.println("success");
    }
}
