package com.itxiaoer.demo.concurrency.art;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java并发编程的艺术第三章，3.1
 *
 * @author : liuyk
 */
@SuppressWarnings("all")
public class Concurrency_03_01 {
    private static int x = 0;


    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(() -> {
                x++;
            });
        }


        Thread t2 = new Thread(() -> System.out.println(x));
        t2.start();
    }
}
