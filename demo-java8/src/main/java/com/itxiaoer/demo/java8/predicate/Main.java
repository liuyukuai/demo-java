package com.itxiaoer.demo.java8.predicate;

import com.itxiaoer.demo.java8.beans.Apple;
import com.itxiaoer.demo.java8.beans.AppleContainer;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author : liuyk
 */
public class Main {

    public static void main(String[] args) {
        Predicate<Apple> red = (e) -> Objects.equals(e.getColor(), "red");
        Predicate<Apple> weight = (e) -> Integer.valueOf(e.getWeight()) > 50;
        AppleContainer.filter(red);
        AppleContainer.filter(red.negate());
        AppleContainer.filter(red.and(weight));
    }
}
