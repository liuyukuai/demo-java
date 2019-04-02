package com.itxiaoer.demo.lazy;

/**
 * 懒汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class LazyOne {
    private static LazyOne instance = null;

    /**
     * 该构造器不安全
     */
    private LazyOne() {

    }

    /**
     * 该实例并不安全
     *
     * @return instance
     */
    public static LazyOne getInstance() {
        if (instance == null) {
            instance = new LazyOne();
        }
        return instance;
    }
}
