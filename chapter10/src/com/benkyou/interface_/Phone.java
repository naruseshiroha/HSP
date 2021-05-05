package com.benkyou.interface_;

// 需要实现 IUSBInterface 的方法
public class Phone implements IUSBInterface {
    @Override
    public void start() {
        System.out.println("phone is starting");
    }

    @Override
    public void stop() {
        System.out.println("phone is stopped");
    }
}
