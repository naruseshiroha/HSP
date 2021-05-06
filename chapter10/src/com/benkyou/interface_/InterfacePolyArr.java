// package com.benkyou.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        // 多态数组 -> 接口类型数组
        USB[] usbs = new USB[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();

        for (USB usb : usbs) {
            usb.work();
            if (usb instanceof Phone_)
                ((Phone_) usb).call();
        }
    }
}

interface USB {
    void work();
}

class Phone_ implements USB {
    public void call() {
        System.out.println("call is called.");
    }

    public void work() {
        System.out.println("phone is starting.");
    }

}

class Camera_ implements USB {
    public void work() {
        System.out.println("camera is starting.");
    }
}
