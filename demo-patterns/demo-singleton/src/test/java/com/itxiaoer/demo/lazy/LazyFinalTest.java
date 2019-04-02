package com.itxiaoer.demo.lazy;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyFinalTest {
    public static void main(String[] args) {
        ConcurrentExecutor.execute(100, LazyFinal::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<LazyFinal> constructor = LazyFinal.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}