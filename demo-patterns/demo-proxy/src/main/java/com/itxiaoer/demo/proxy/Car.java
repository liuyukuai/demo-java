package com.itxiaoer.demo.proxy;

import java.util.concurrent.TimeUnit;

/**
 * @author : liuyk
 */
public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("car moving...... ");
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
