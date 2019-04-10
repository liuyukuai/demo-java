package com.itxiaoer.demo.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 *
 * @author : liuyk
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("do something start. ");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("do something end. ");
        return invoke;
    }
}
