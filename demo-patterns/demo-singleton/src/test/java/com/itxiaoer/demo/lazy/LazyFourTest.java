package com.itxiaoer.demo.lazy;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyFourTest {
    public static void main(String[] args) {
        ConcurrentExecutor.execute(100, LazyFour::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<LazyFour> constructor = LazyFour.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}