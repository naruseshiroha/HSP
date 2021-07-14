package com.benkyou.jdbc.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Jdbc01 {
    public static void main(String[] args) throws Exception {
        // jdbc:mysql:// 规定好表示协议,通过jdbc的方式连接mysql
        // localhost 主机,可以是ip地址; 3306 表示mysql监听的端口
        // jdbc 数据库; mysql的连接本质就是前面学过的 socket 连接
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///jdbc?useSSL=false&ServeTimezone=GMT%2B8";
        String user = "root";
        String password = "lixunsam";

        // 1.加载驱动 mysql5.1.6以后会自动加载驱动
        Class.forName(className); // 写上更加明确
        // 2.得到连接
        Connection connection = DriverManager.getConnection(url, user, password);
        // 3.执行sql
        String sql = """
                    create table actor(
                        id int primary key auto_increment,
                        name varchar(32) not null default '',
                        gender char(1) not null default 'f',
                        born_date datetime,
                        phone varchar(12)
                    )
                """;
        sql = "insert into actor values(?,?,?,?,?)";
        // Statement 用于执行静态SQL语句并返回其 生成的结果的对象
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, null);
        statement.setObject(2, "刘德华");
        statement.setObject(3, "m");
        statement.setObject(4, "1970-11-11");
        statement.setObject(5, "110");
        int rows = statement.executeUpdate();
        // System.out.println(rows);
        System.out.println(rows > 0 ? "success" : "errors");
        // 4.关闭连接
        statement.close();
        connection.close();
    }
}
