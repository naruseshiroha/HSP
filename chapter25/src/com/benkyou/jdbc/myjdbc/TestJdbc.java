package com.benkyou.jdbc.myjdbc;

import org.junit.Test;

public class TestJdbc {

    @Test
    public void testMySQLJdbc() {
        JdbcInterface mysql = new MysqlJdbcImpl();
        mysql.getConnection();
        mysql.crud();
        mysql.close();
    }

    @Test
    public void testOracleJdbc() {
        JdbcInterface oracle = new OracleJdbcImpl();
        oracle.getConnection();
        oracle.crud();
        oracle.close();
    }

}
