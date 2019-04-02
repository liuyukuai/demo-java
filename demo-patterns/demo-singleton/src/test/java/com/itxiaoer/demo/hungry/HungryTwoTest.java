package com.itxiaoer.demo.hungry;

import com.itxiaoer.demo.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class HungryTwoTest {

    public static void main(String[] args) {
        ConcurrentExecutor.execute(100, HungryTwo::getInstance);
        ConcurrentExecutor.execute(100, () -> {
            try {
                Constructor<HungryTwo> constructor = HungryTwo.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}