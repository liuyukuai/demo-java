package com.itxiaoer.demo.jvm.ref;

import java.lang.ref.SoftReference;

/**
 * 弱引用
 *
 * @author : liuyk
 */
public class SoftRef {

    public static void main(String[] args) {

        // 用SoftReference包装对象
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        // 使用get()方法获取对象的强引用，如果对象被回收，则返回null
        System.out.println(softReference.get());
    }
}
