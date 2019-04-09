package com.itxiaoer.demo.proxy.jdk;

import com.itxiaoer.demo.proxy.Car;
import com.itxiaoer.demo.proxy.Movable;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class JdkProxyTest {

    @Test
    public void invoke() {
        Movable o = (Movable) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), Car.class.getInterfaces(), new JdkProxy(new Car()));
        o.move();
    }
}