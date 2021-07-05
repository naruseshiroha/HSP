package com.benkyou.synchronize;

public class DeadLock {
    public static void main(String[] args) {
        new Thread(new DeadLoakDemo(true)).start();
        new Thread(new DeadLoakDemo(false)).start();
    }
}

class DeadLoakDemo implements Runnable {

    static Object o1 = new Object(); // 保证多线程共享一个对象
    static Object o2 = new Object();
    boolean flag;

    public DeadLoakDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        // 1.如果 flag 为 T,线程 A 就会先得到/持有 o1 对象锁,然后尝试去获取 o2 对象锁
        // 2.如果线程 A 得不到 o2 对象锁,就会 Blocked
        // 3.如果 flag 为 F,线程 B 就会先得到/持有 o2 对象锁,然后尝试去获取 o1 对象锁
        // 4.如果线程 B 得不到 o1 对象锁,就会 Blocked
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}
