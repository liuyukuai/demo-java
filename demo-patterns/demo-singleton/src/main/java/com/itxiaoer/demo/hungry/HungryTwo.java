package com.itxiaoer.demo.hungry;

/**
 * 饿汉单例模式
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class HungryTwo {

    private static final HungryTwo INSTANCE = new HungryTwo();

    /**
     * 判断对象是否被初始化
     */
    private static volatile boolean init = false;

    /**
     * 该构造器不安全，一般不限制
     */
    private HungryTwo() {
        synchronized (HungryTwo.class) {
            if (!init) {
                init = !init;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public static HungryTwo getInstance() {
        return INSTANCE;
    }
}
