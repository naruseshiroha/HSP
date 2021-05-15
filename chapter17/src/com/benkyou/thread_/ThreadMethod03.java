package com.benkyou.thread_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        DThread dThread = new DThread();
        Thread thread = new Thread(dThread);
        // 将 thread 设置为守护线程,当所有线程结束后,thread 也就自动结束
        // 如果没有设置,那么即使 main 线程执行完毕, thread 也不退出,可以体验一下
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(50);
            System.out.println("hi hi hi");
        }
    }
}

class DThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ha ha ha...");
        }
    }
}
