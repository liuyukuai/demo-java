package com.itxiaoer.demo.concurrency.future;

import java.util.concurrent.CompletableFuture;

/**
 * @author : liuyk
 */
public class CompletableFutureDemo {
    public static void main(String[] args) {
        println("当前线程");
        CompletableFuture.supplyAsync(() -> {
            println("第一步执行");
            return "hello";
        }).thenApplyAsync((m) -> {
            println("第二步执行");
            return m + ", world";
        }).thenAccept(CompletableFutureDemo::println).join();
    }


    private static void println(String message) {
        System.out.printf("当前线程[%s]-> 执行： %s\n", Thread.currentThread().getName(), message);
    }

}
