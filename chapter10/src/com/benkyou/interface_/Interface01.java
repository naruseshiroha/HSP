package com.benkyou.interface_;

public class Interface01 {
    public static void main(String[] args) {
        var camera = new Camera();
        var phone = new Phone();
        var computer = new Computer();

        computer.work(phone);
        computer.work(camera);
    }
}
