package com.benkyou.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        CThread cThread = new CThread();
        Thread thread = new Thread(cThread);
        thread.start();
        thread.join();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(50);
            System.out.println("Main, i=" + i);
        }
    }
}

class CThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread, i=" + i);
        }
    }
}
