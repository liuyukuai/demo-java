package com.itxiaoer.demo.inner;

/**
 * @author : liuyk
 */
public class LazyInner {

    /**
     * 判断对象是否被初始化
     */
    private static volatile boolean init = false;

    /**
     * 该构造器不安全，一般不限制
     */
    private LazyInner() {
        synchronized (LazyInner.class) {
            if (!init) {
                init = !init;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    private static class Inner {
        private static volatile LazyInner instance = new LazyInner();
    }

    /**
     * 该线程安全
     *
     * @return instance
     */
    public static LazyInner getInstance() {
        return Inner.instance;
    }

    /**
     * 解决序列化创建多对象的问题
     *
     * @return instance
     */
    @SuppressWarnings("unused")
    public LazyInner readResolve() {
        return Inner.instance;
    }
}
