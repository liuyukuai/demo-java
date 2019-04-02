package com.itxiaoer.demo;

import lombok.AllArgsConstructor;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

/**
 * @author : liuyk
 */
public class ConcurrentExecutor {


    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    private static AtomicLong timer = new AtomicLong();


    public static void execute(int con, Supplier supplier) {
        // 准备线程
        for (int i = 0; i < con; i++) {
            new Thread(new Task(countDownLatch, supplier)).start();
        }
        // 使用计数器-1,100线程同时执行
        countDownLatch.countDown();
    }


    @AllArgsConstructor
    static class Task implements Runnable {

        private CountDownLatch countDownLatch;

        private Supplier supplier;


        @Override
        public void run() {
            try {
                countDownLatch.await();
                Object instance = supplier.get();
                System.out.println("time : " + Instant.now().toEpochMilli() + ", instance : " + instance);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
