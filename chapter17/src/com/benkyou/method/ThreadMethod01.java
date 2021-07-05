package com.benkyou.method;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        BThread bThread = new BThread();
        Thread thread = new Thread(bThread);
        thread.setName("LX");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        System.out.println("default priority is " + Thread.currentThread().getPriority());
        Thread.sleep(3000);
        thread.interrupt();
    }
}

class BThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ",i=" + i);
        }
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted.");
//            e.printStackTrace();
        }
    }
}
