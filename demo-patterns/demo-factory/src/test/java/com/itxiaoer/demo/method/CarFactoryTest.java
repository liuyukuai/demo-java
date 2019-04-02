package com.itxiaoer.demo.method;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 工厂方法测试类
 *
 * @author : liuyk
 */
public class CarFactoryTest {

    @Test
    public void create() {
        System.out.println(new BenzFactory().create().getName());
        System.out.println(new BwmFactory().create().getName());
    }
}