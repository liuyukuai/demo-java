package com.itxiaoer.demo.hungry;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class HungryOneTest {

    public static void main(String[] args) {
        ConcurrentExecutor.execute(100, HungryOne::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<HungryOne> constructor = HungryOne.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}