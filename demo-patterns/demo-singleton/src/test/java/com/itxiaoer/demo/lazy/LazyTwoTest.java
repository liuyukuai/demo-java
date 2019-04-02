package com.itxiaoer.demo.lazy;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyTwoTest {
    public static void main(String[] args) {
        ConcurrentExecutor.execute(100, LazyTwo::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<LazyTwo> constructor = LazyTwo.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}