package com.benkyou.interface_;

public class MySQL_DB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接MySQL");
    }

    @Override
    public void close() {
        System.out.println("关闭 MySQL");
    }
}
