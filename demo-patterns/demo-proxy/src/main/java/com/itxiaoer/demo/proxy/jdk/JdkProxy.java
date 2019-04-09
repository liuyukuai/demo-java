package com.itxiaoer.demo.proxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : liuyk
 */

public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do something start. ");
        Object invoke = method.invoke(target, args);
        System.out.println("do something end. ");
        return invoke;
    }
}
