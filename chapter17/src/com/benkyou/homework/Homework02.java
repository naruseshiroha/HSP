package com.benkyou.homework;

public class Homework02 {
    public static void main(String[] args) {
        CThread c = new CThread();
        new Thread(c).start();
        new Thread(c).start();
    }
}

class CThread implements Runnable {

    private int money = 10000;

    @Override
    public void run() {
        while (true) {
            // 1.这里使用 synchronized 实现了线程同步
            // 2.当多个线程执行到这里时,就会去争夺 this 对象锁
            // 3.哪个线程争夺(获取)到对象锁,就执行 synchronized 代码块,执行完后会释放 this 对象锁
            // 4.争夺不到 this 对象锁,就 blocked,准备继续争夺
            // 5.this 对象锁
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("残高が足りない");
                    return;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取出1000,剩余" + money);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
