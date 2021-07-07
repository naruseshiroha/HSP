package com.benkyou.properties_;

import java.io.FileReader;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws Exception {
        // 使用 Properties 类来读取 mysql.properties 文件
        // 1.创建 Properties 对象
        Properties properties = new Properties();
        // 2.加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        // 3.把 K-V 显示到控制台
        properties.list(System.out);
        // 4.根据 key 获取对应的值
        System.out.println("======================");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("username=" + username);
        System.out.println("password=" + password);
    }
}
