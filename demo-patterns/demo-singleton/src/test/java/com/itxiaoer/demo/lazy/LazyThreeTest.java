package com.itxiaoer.demo.lazy;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyThreeTest {
    public static void main(String[] args) {
        ConcurrentExecutor.execute(1000, LazyThree::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<LazyThree> constructor = LazyThree.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}