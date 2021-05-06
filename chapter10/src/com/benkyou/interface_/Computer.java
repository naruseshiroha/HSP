package com.benkyou.interface_;

public class Computer {
    public void work(IUSBInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
