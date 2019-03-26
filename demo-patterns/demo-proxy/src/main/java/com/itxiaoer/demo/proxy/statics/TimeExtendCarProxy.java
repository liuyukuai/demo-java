package com.itxiaoer.demo.proxy.statics;

import com.itxiaoer.demo.proxy.Car;

import java.time.Instant;

/**
 * 继承方式实现静态代理
 *
 * @author : liuyk
 */
public class TimeExtendCarProxy extends Car {
    @Override
    public void move() {
        long start = Instant.now().toEpochMilli();
        super.move();
        long end = Instant.now().toEpochMilli();
        System.out.println("move time : " + (end - start));

    }
}
