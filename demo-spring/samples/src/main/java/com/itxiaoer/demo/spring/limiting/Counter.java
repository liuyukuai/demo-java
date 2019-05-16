package com.itxiaoer.demo.spring.limiting;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * 限流算法一
 * 计数器算法
 * <p>
 * 优点：实现简单
 * 缺点：临界值会计算不准确
 *
 * @author : liuyk
 */
@SuppressWarnings("ALL")
public class Counter {

    /**
     * 起始时间
     */
    private static long time = Instant.now().toEpochMilli();

    /**
     * 请求数
     */
    private static long reqCount = 1;
    /**
     * 单位时间内限制的请求数
     */
    private static long limit = 5;

    /**
     * 时间间隔，单位时间(interval)内限制请求数量(limit)
     */
    private static long interval = 60 * 1000;


    private static void grant() {
        System.out.println("当前请求数量：" + reqCount);

        // 计算当前时间
        long now = Instant.now().toEpochMilli();
        // 每隔interval计算一次时间周期
        // 当前时间还在一个时间周期内
        if (now < time + interval) {
            // 请求数量加1
            reqCount++;
            //请求大于限制的请求数量
            if (reqCount > limit) {
                throw new RuntimeException(" trigger limiting.");
            }
        } else {
            // 超过时间周期，计数器重置
            time = now;
            reqCount = 1;
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                grant();
            } catch (InterruptedException | RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
