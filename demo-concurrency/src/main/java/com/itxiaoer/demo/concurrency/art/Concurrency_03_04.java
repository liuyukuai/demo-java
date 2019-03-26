package com.itxiaoer.demo.concurrency.art;

import java.util.concurrent.TimeUnit;

/**
 * java并发编程的艺术第三章，3.1
 *
 * @author : liuyk
 */
@SuppressWarnings("all")
public class Concurrency_03_04 {
    private volatile boolean stop = false;

    private int x = 0;

    public void set() {
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
        x = 5;
    }

    public void get() {

        while (!stop) {
            System.out.println("running...");
        }
        System.out.println("stop...");
    }


    public static void main(String[] args) {
        Concurrency_03_04 concurrency_03_04 = new Concurrency_03_04();
        Thread t1 = new Thread(() -> concurrency_03_04.set());
        Thread t2 = new Thread(() -> concurrency_03_04.get());
        t1.start();
        t2.start();
    }
}
