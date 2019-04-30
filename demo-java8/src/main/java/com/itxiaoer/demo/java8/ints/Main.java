package com.itxiaoer.demo.java8.ints;

import java.lang.reflect.Field;

/**
 * @author : liuyk
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a = 1;
        Integer b = 2;
        swap(a, b);
    }

    private static void swap(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        //反射改变
        Field field = Integer.class.getDeclaredField("value");
        int temp = a;
        field.setAccessible(true);
        field.set(a, b);
        field.set(b, temp);
        System.out.println(Integer.valueOf(1));
    }
}
