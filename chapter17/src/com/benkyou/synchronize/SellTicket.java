package com.benkyou.synchronize;

public class SellTicket {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

class SellTicket03 implements Runnable {

    private static int ticketNum = 100; // 让多个线程共享 ticketNum
    private boolean loop = true; // 控制循环
    private Object object = new Object();

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    // 同步方法(静态)的锁为当前类本身
    // 1. public synchronized static void m1() {} 锁是加在 SellTicket03.class 上

    public /* */ synchronized static void m1() {

    }

    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }

    // 1.public synchronized void sell() {} 就是一个同步方法
    // 2.这时锁在 this 对象
    // 3.也可以在代码块上写 synchronized,同步代码块
    public /* synchronized */ void sell() {
        synchronized (/* this */ object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }
            // 休眠 50 mm
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票,剩余票数:" + (--ticketNum));

        }
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    public void m() {
        // this 不是同一个对象
        // synchronized (this) {
        //     System.out.println("hello");
        // }
    }
}