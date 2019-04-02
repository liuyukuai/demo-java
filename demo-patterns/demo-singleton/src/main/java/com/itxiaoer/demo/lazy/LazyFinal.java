package com.itxiaoer.demo.lazy;

import java.io.Serializable;

/**
 * 懒汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class LazyFinal implements Serializable {

    private static volatile LazyFinal instance = null;

    /**
     * 判断对象是否被初始化
     */
    private static volatile boolean init = false;

    /**
     * 该构造器不安全，一般不限制
     */
    private LazyFinal() {
        synchronized (LazyFinal.class) {
            if (!init) {
                init = !init;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /**
     * 该线程安全
     *
     * @return instance
     */
    public static LazyFinal getInstance() {
        if (instance == null) {
            synchronized (LazyFinal.class) {
                if (instance == null) {
                    instance = new LazyFinal();
                }
            }
        }
        return instance;
    }

    /**
     * 解决序列化创建多对象的问题
     *
     * @return instance
     */
    @SuppressWarnings("unused")
    public LazyFinal readResolve() {
        return instance;
    }
}
