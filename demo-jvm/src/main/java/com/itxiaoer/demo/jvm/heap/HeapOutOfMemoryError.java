package com.itxiaoer.demo.jvm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 堆内存泄露
 *
 * @author : liuyk
 */
@SuppressWarnings("ALL")
public class HeapOutOfMemoryError {
    private static List<String> CONTAINER = new ArrayList<>();

    public static void main(String[] args) {
        for (; ; ) {
            CONTAINER.add("hello" + new Random().nextInt(1000000));
        }
    }
    // -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=oom.dump
}
