package com.benkyou.thread_;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        // dog.start() 不能调用 start() 方法
//        // 创建了 Thread 对象,把 dog 对象(实现 Runnable),放入 Thread
//        Thread thread = new Thread(dog); // 代理模式
//        thread.start();

        Tiger tiger = new Tiger(); // 实现了 Runnable 接口
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();

    }
}

class Animal {}

class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("tiger ao ao ao...");
    }
}

class ThreadProxy implements Runnable { // 把 Proxy 类当作 Thread

    private Runnable target = null; // 属性,类型是 Runnable

    @Override
    public void run() {
        if (target != null) target.run(); // 动态绑定(运行类型 Tiger)
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0(); // 真正实现多线程方法
    }

    public void start0() {
        run();
    }

}

class Dog implements Runnable {
    int times = 0;

    @Override
    public void run() {
        System.out.println("name=" + Thread.currentThread().getName());
        while (true) {
            System.out.println("Dog hi,times=" + ++times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8) break;
        }
    }
}
