package com.itxiaoer.demo.proxy.main;

import com.itxiaoer.demo.proxy.statics.TimeExtendCarProxy;

/**
 * @author : liuyk
 */
public class Main {
    public static void main(String[] args) {
        //   静态代理
        TimeExtendCarProxy timeExtendCarProxy = new TimeExtendCarProxy();
        timeExtendCarProxy.move();
    }

}
