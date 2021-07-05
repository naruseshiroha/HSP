package com.benkyou.state;

public class ThreadState_ {
    /*
    NEW, 尚未启动的线程处于此状态
    RUNNABLE, 在 java 虚拟机中执行的线程处于此状态
    BLOCKED, 被阻塞等待监视器锁定的线程处于此状态
    WAITING, 正在等待另一个线程执行特定动作的的线程处于此状态
    TIMED_WAITING, 正在等待另一个线程执行动作达到指定等待时间的线程处于此状态
    TERMINATED, 已退出的线程处于此状态
     */
    public static void main(String[] args) {
        Thread t = new Thread(new T());
        System.out.println(t.getName() + ", state:" + t.getState());
        t.start();
        while (Thread.State.TERMINATED != t.getState()) {
            System.out.println(t.getName() + ", state:" + t.getState());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(t.getName() + ", state:" + t.getState());

    }
}

class T implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
    }
}
