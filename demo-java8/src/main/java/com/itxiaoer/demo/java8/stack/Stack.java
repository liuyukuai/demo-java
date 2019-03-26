package com.itxiaoer.demo.java8.stack;

/**
 * @author : liuyk
 */
public interface Stack<E> {

    int DEFAULT_CAPACITY = 16;

    E push(E item);

    E pop();

    E peek();

    boolean empty();

    int size();
}

