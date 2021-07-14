package com.benkyou.jdbc.myjdbc;

public class OracleJdbcImpl implements JdbcInterface {

    @Override
    public Object getConnection() {
        System.out.println("oracle getConnection().");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("oracle curd().");

    }

    @Override
    public void close() {
        System.out.println("oracle close().");
    }

}
