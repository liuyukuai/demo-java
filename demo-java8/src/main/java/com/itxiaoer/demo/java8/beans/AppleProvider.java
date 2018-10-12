package com.itxiaoer.demo.java8.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author : liuyk
 */
class AppleProvider {

    private static List<String> colors = Arrays.asList("red", "blue");

    static List<Apple> create(int size) {
        List<Apple> apples = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            apples.add(new Apple("apple" + i, colors.get(random.nextInt(colors.size())), String.valueOf(random.nextDouble() * 100)));
        }
        return apples;
    }
}
