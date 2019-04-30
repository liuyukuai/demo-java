package com.itxiaoer.demo.java8.interview;

/**
 * @author : liuyk
 */
@SuppressWarnings("ALL")
public class Sample1 {


    /**
     * 1、第一步执行：
     * private static Sample1 instance = new Sample1();
     * 2、构造器执行，这个时候c0，c1都为0，已经初始化，但还没有按照秩序员要求初始化。
     * 3、构造器执行结束后c0=1，c1=1
     * 4、初始化c1，c0没有赋值操作，无需按照程序员初始化。
     * 5、最后c0=1，c1=3
     */
    private static Sample1 instance = new Sample1();
    private static int c0;
    private static int c1 = 3;

    private Sample1() {
        c0++;
        c1++;
    }

    public static Sample1 newInstance() {
        return instance;
    }


    public static void main(String[] args) {
        Sample1.newInstance();
        System.out.println("c0 = " + c0);
        System.out.println("c1 = " + c1);
    }
}
