package com.itxiaoer.demo.jvm;

/**
 * @author : liuyk
 */
@SuppressWarnings("all")
public class ObjectIsLive {

    public ObjectIsLive instance = null;
    /**
     * 这个成员作用在于占用内存，以便GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2 * 1024 * 1024];


    public static void main(String[] args) {

        ObjectIsLive objA = new ObjectIsLive();
        ObjectIsLive objB = new ObjectIsLive();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        // 假定这里执行GC,objA和ojbB是否能被回收掉？
        System.gc();
    }
}

