package com.itxiaoer.demo.java8.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author : liuyk
 */
public class AppleContainer {

    /**
     * apple container
     */
    private static List<Apple> APPLES;

    static {
        APPLES = AppleProvider.create(20);
    }

    public static List<Apple> filter(Predicate<Apple> predicate) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : APPLES) {
            if (predicate.test(apple)) {
                apples.add(apple);
            }
        }
        return apples;
//        return APPLES.stream().filter(predicate).collect(Collectors.toList());
    }
}
