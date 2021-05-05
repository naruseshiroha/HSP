package com.benkyou.interface_;

public class Camera implements IUSBInterface {
    @Override
    public void start() {
        System.out.println("camera is starting");
    }

    @Override
    public void stop() {
        System.out.println("camera is starting");
    }
}
