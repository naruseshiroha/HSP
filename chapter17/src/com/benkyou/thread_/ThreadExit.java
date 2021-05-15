package com.benkyou.thread_;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        AThread aThread = new AThread();
        Thread thread = new Thread(aThread);
        thread.start();

        Thread.sleep(2000);
        aThread.setLoop(false);
    }
}

class AThread implements Runnable {

    private boolean loop = true; // 1.定义标记变量,默认为true
    private int times = 0;

    @Override
    public void run() {
        while (loop) { // 2.将loop作为循环条件
            System.out.println("times=" + ++times);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 提供公共的 set 方法,应用于更新 loop,终止线程
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}