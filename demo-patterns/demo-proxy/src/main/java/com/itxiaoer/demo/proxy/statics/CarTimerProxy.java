package com.itxiaoer.demo.proxy.statics;

import com.itxiaoer.demo.proxy.Movable;

import java.time.Instant;

/**
 * car 静态代理
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class CarTimerProxy implements Movable {
    private Movable movable;

    public CarTimerProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long start = Instant.now().toEpochMilli();
        movable.move();
        long end = Instant.now().toEpochMilli();
        System.out.println("move time : " + (end - start));
    }
}
