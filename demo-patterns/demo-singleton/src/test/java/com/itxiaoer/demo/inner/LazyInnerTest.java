package com.itxiaoer.demo.inner;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyInnerTest {
    public static void main(String[] args) {
        ConcurrentExecutor.execute(10, LazyInner::getInstance);
        ConcurrentExecutor.execute(10, () -> {
            try {
                Constructor<LazyInner> constructor = LazyInner.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }

}