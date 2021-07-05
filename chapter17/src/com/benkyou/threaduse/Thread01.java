package com.benkyou.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        // 创建 Cat 对象,可以当做线程使用
        Cat cat = new Cat();
        /*
        public synchronized void start() {
            start0();
        }
        // start0() 是本地方法,是JVM调用,底层是c/c++实现,真正实现多线程的效果,是 start0(),而不是 run
        private native void start0();
         */
        cat.start();
//        cat.run(); // run 方法就是一个普通的方法,没有真的启动一个线程,就会把 run 方法执行完毕,才向下执行
        // 说明:当 main 线程启动一个子线程 Thread-0,主线程不会阻塞,会继续执行
        //     这时主线程和子线程是同时执行的
        System.out.println("main thread name=" + Thread.currentThread().getName());
        for (int i = 1; i <= 6; i++) {
            System.out.println("main thread i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 1.当一个类继承 thread 类,该类就可以放做线程使用
// 2.我们会重写 run 方法,写上自己的业务代码
// 3.run Thread 类 实现了 Runnable 接口的方法
class Cat extends Thread {
    int times = 0;

    @Override
    // 写上自己的逻辑
    public void run() {
//        super.run();
        while (true) {
            System.out.println("thread name =" + Thread.currentThread().getName());
            System.out.println("times=" + ++times + ",nya...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8) break;
        }
    }
}