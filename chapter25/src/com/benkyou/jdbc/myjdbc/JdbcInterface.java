package com.benkyou.jdbc.myjdbc;

public interface JdbcInterface {
    // connection
    Object getConnection();

    // crud
    void crud();

    // close
    void close();
}
