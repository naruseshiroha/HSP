package jp.benkyou.mysql;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class JavaMysql {
    public static void main(String[] args) throws Exception {
        // java 操作 MySQL
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///benkyou?useSSL=false&ServeTimezone=GBT%2B8";
        String user = "root";
        String password = "lixunsam";

        // 加载类,得到mysql连接
        Class.forName(className);
        Connection connection = DriverManager.getConnection(url, user, password);

        // 编写 SQL
        String sql = """
                create table tbl_good(
                    id int primary key auto_increment,
                    name varchar(32),
                    price decimal(10,2),
                    introduce text
                )""";
        sql = """
                    insert into tbl_good
                    values(1,'xpreia Ⅲ',8999.99,'Sony 大法好. 信仰')
                """;
        sql = """
                    drop table tbl_good
                """;

        // 得到 Statement 对象,把 sql 语法发送给 mysql 执行
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        //
        statement.close();
        connection.close();

        System.out.println("success");
    }
}
