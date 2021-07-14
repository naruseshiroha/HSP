package com.benkyou.jdbc.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

import org.junit.Test;

public class JdbcConn {

    @Test
    public void connect1() throws Exception {
        Driver driver = new Driver();
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///jdbc?useSSL=false&ServeTimezone=GMT%2B8";
        String user = "root";
        String password = "lixunsam";
        Class.forName(className);

        Properties info = new Properties();
        info.setProperty("user", user);
        info.setProperty("password", password);

        Connection connection = driver.connect(url, info);
        System.out.println(connection);
    }

    @Test
    public void connect2() throws Exception {
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///jdbc?useSSL=false&ServeTimezone=GMT%2B8";
        String user = "root";
        String password = "lixunsam";

        // 反射加载 Driver 类,动态加载,更加灵活,减少依赖性
        Class<?> aClass = Class.forName(className);
        Driver driver = (Driver) aClass.getConstructor().newInstance();

        Properties info = new Properties();
        info.setProperty("user", user);
        info.setProperty("password", password);

        Connection connection = driver.connect(url, info);
        System.out.println(connection);
    }

    @Test
    public void connect3() throws Exception {
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///jdbc?useSSL=false&ServeTimezone=GMT%2B8";
        String user = "root";
        String password = "lixunsam";

        // 反射加载 Driver 类,动态加载,更加灵活,减少依赖性
        Class<?> aClass = Class.forName(className);
        Driver driver = (Driver) aClass.getConstructor().newInstance();

        DriverManager.registerDriver(driver); // 注册driver驱动

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    // Class.forName 自动完成注册驱动,简化代码
    @Test
    public void connect4() throws Exception {
        String className = "com.mysql.cj.jdbc.Driver";
        Class.forName(className);

        String url = "jdbc:mysql:///jdbc?useSSL=false&ServeTimezone=GMT%2B8";
        String user = "root";
        String password = "lixunsam";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    // Class.forName 自动完成注册驱动,简化代码
    @Test
    public void connect5() throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("D:\\hsp\\chapter25\\src\\mysql.properties"));
        String className = info.getProperty("className");
        String url = info.getProperty("url");

        Class.forName(className);
        Connection connection = DriverManager.getConnection(url, info);
        System.out.println(connection);
    }
}
