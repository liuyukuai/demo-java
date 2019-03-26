package com.itxiaoer.demo.concurrency.t01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 伪共享测试
 */
public class FalseSharingTest {
    @NoArgsConstructor
    static class FalseSharing {
        volatile long v;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class FalseSharingThread extends Thread {
        List<FalseSharing> sharings;
        int index;

        @Override
        public void run() {
            for (int i = 0; i < 1000000000L; i++) {
                sharings.get(index).v++;
            }

        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            run();
        }
    }

    public static void run() throws Exception {
        int size = Runtime.getRuntime().availableProcessors();
        List<FalseSharing> lists = Stream.of(new FalseSharing[size]).map(e -> new FalseSharing()).collect(Collectors.toList());

        Thread[] threads = new Thread[size];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new FalseSharingThread(lists, i);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        long start = Instant.now().getEpochSecond();

        for (Thread thread : threads) {
            thread.join();
        }

        long end = Instant.now().getEpochSecond();

        System.out.println("total costs " + (end - start) + "ms");
    }


}
