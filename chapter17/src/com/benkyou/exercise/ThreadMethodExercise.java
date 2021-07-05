package com.benkyou.exercise;

public class ThreadMethodExercise {
    public static void main(String[] args) throws Exception {
        Thread t3 = new Thread(new T3());
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                t3.start(); // 启动子线程
                t3.join(); // 立即将 t3 子线程插入到 main,让 t3 先执行
            }
            System.out.println("hi" + i);
            Thread.sleep(1000);
        }
    }
}

class T3 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                return;
            }
        }
    }
}
