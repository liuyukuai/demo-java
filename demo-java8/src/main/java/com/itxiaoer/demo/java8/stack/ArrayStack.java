package com.itxiaoer.demo.java8.stack;

import java.util.Arrays;

/**
 * @author : liuyk
 */
public class ArrayStack<E> implements Stack<E> {

    private Object[] elements;

    private int size;

    private int capacity;

    private int top;

    public ArrayStack() {
        this.capacity = DEFAULT_CAPACITY;
        this.elements = new Object[this.capacity];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity <= 0 ? DEFAULT_CAPACITY : capacity;
        this.elements = new Object[this.capacity];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity - elements.length > 0) {
            this.elements = Arrays.copyOf(elements, minCapacity * 2);
        }
    }

    @Override
    public E push(E item) {
        ensureCapacity(size + 1);
        this.elements[top++] = item;
        this.size++;
        return item;
    }

    @Override
    public E pop() {
        E peek = peek();
        this.elements[this.top--] = null;
        this.size--;
        return peek;
    }

    @Override
    public E peek() {
        if (this.empty()) {
            throw new RuntimeException();
        }
        return (E) elements[this.top - 1];
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}

