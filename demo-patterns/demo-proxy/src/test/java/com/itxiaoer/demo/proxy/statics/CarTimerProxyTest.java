package com.itxiaoer.demo.proxy.statics;

import com.itxiaoer.demo.proxy.Car;
import org.junit.Test;


public class CarTimerProxyTest {

    @Test
    public void move() {
        CarTimerProxy proxy = new CarTimerProxy(new Car());
        proxy.move();
    }
}