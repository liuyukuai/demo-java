package com.itxiaoer.demo.abstraction;

import org.junit.Test;

public class CarFactoryTest {

    @Test
    public void createCar() {
        System.out.println(new BenzFactory().createCar().getName());
        System.out.println(new BwmFactory().createCar().getName());
    }

    @Test
    public void createPlane() {
        System.out.println(new BenzFactory().createPlane().getName());
        System.out.println(new BwmFactory().createPlane().getName());
    }
}