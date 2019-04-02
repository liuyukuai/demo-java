package com.itxiaoer.demo.lazy;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyOneTest {
    public static void main(String[] args) {
        ConcurrentExecutor.execute(100,LazyOne::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<LazyOne> constructor = LazyOne.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}