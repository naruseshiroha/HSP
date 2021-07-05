package com.benkyou.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        AThread a = new AThread();
        new Thread(a).start();
        BThread b = new BThread(a);
        new Thread(b).start();
    }
}

class AThread implements Runnable {

    private boolean loop = true;

    public boolean getLoop() {
        return this.loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println(new Random().nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BThread implements Runnable {
    private AThread aThread;
    private Scanner scanner = new Scanner(System.in);

    public BThread(AThread aThread) {
        this.aThread = aThread;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("请输入您的指令:");

            char c = scanner.next().toUpperCase().charAt(0);
            if (c == 'Q') {
                aThread.setLoop(false);
                System.out.println("B exit.");
                return;
            }
        }
    }
}