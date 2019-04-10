package com.itxiaoer.demo.proxy.cglib;

import com.itxiaoer.demo.proxy.Car;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class CglibProxyTest {

    @Test
    public void intercept() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new CglibProxy());
        Car car = (Car) enhancer.create();
        car.move();

    }
}