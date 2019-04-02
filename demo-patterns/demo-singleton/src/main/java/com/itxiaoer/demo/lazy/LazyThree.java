package com.itxiaoer.demo.lazy;

/**
 * 懒汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class LazyThree {
    private static volatile LazyThree instance = null;

    /**
     * 该构造器不安全
     */
    private LazyThree() {

    }

    /**
     * 该实例线程不安全
     * 说明：
     * 1、线程A和线程B同时到达synchronized位置，假如线程A进入到同步块，在执行完new之后，会释放锁。
     * 2、当线程A释放完锁之后，线程B依旧可以进入同步块，也就是还可以new，所以不同保证单例。
     *
     * @return instance
     */
    public static LazyThree getInstance() {
        if (instance == null) {
            synchronized (LazyThree.class) {
                instance = new LazyThree();
            }
        }
        return instance;
    }
}
