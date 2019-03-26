package com.itxiaoer.demo.concurrency.t01;

import java.time.Instant;

/**
 * @author : liuyk
 */
public class ConcurrencyTest {
    private static final long count = 100000000000L;


    public static void main(String[] args) throws InterruptedException {
        serial();
        concurrency();
    }

    private static void concurrency() throws InterruptedException {
        long start = Instant.now().getEpochSecond();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (long l = 0; l < count; l++) {
                a += 5;
            }
        });

        thread.start();

        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        thread.join();


        long end = Instant.now().getEpochSecond();
        System.out.println("concurrency time = " + (end - start) + " b = " + b);
    }

    private static void serial() {
        long start = Instant.now().getEpochSecond();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }

        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long end = Instant.now().getEpochSecond();
        System.out.println("serial time = " + (end - start) + ", a = " + a + ", b = " + b);
    }
}
