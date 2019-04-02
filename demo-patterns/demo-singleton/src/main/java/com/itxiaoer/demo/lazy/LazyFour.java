package com.itxiaoer.demo.lazy;

/**
 * 懒汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class LazyFour {

    private static volatile LazyFour instance = null;

    /**
     * 该构造器不安全
     */
    private LazyFour() {

    }

    /**
     * 该线程安全
     *
     * @return instance
     */
    public static LazyFour getInstance() {
        if (instance == null) {
            synchronized (LazyFour.class) {
                if (instance == null) {
                    instance = new LazyFour();
                }
            }
        }
        return instance;
    }
}
