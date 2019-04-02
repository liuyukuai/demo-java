package com.itxiaoer.demo.hungry;

/**
 * 饿汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class HungryOne {

    private static final HungryOne INSTANCE = new HungryOne();

    /**
     * 该构造器不安全
     */
    private HungryOne() {
    }

    public static HungryOne getInstance() {
        return INSTANCE;
    }
}
