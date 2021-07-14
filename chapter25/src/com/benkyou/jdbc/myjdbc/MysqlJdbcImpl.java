package com.benkyou.jdbc.myjdbc;

public class MysqlJdbcImpl implements JdbcInterface {

    @Override
    public Object getConnection() {
        System.out.println("mysql getConnection().");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("mysql curd().");

    }

    @Override
    public void close() {
        System.out.println("mysql close().");
    }

}
