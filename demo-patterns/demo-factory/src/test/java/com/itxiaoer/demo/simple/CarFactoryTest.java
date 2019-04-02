package com.itxiaoer.demo.simple;

import org.junit.Test;

/**
 * 简单工厂测试类
 */
public class CarFactoryTest {

    @Test
    public void create() {
        System.out.println(CarFactory.create("bwm").getName());
        System.out.println(CarFactory.create("benz").getName());
        System.out.println(CarFactory.create("auto").getName());
    }
}