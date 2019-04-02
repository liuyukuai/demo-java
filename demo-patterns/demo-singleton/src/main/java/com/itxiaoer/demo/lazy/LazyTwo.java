package com.itxiaoer.demo.lazy;

/**
 * 懒汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class LazyTwo {
    private static LazyTwo instance = null;

    /**
     * 该构造器不安全
     */
    private LazyTwo() {

    }

    /**
     * 该实例安全，但是性能差
     *
     * @return instance
     */
    public static synchronized LazyTwo getInstance() {
        if (instance == null) {
            instance = new LazyTwo();
        }
        return instance;
    }
}
