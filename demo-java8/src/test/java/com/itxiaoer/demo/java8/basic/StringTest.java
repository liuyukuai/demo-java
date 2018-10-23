package com.itxiaoer.demo.java8.basic;


import org.junit.Assert;
import org.junit.Test;

/**
 * 双等号==的含义
 * 基本数据类型之间应用双等号，比较的是他们的数值。
 * 复合数据类型(类)之间应用双等号，比较的是他们在内存中的存放地址。
 *
 * @author : liuyk
 */
@SuppressWarnings("all")
public class StringTest {

    private String s1 = "java";
    private String s2 = new String("java");
    private String s3 = "ja";
    private String s4 = "va";
    private String s5 = s3 + s4;
    private String s6 = "ja" + "va";
    private String s7 = s2.intern();


    private static String s8 = "ja";
    private static String s9 = "va";
    private static String s10 = s8 + s9;


    @Test
    public void excute() {
        // s2 为引用类型 比较地址 false
        Assert.assertFalse(s1 == s2);
        // s1 只创建一个常量"java",会放到字符串常量池中去，"java"是字面量，故是同一常量，地址相同
        Assert.assertTrue("java" == s1);
        // s2 为引用类型 比较地址 false
        Assert.assertFalse("java" == s2);

        // 连接表达式 +
        // 只有+两边都是字面量才会将值放入到常量池中去
        // s5 对象，s6 常量池中
        Assert.assertFalse(s1 == s5);
        Assert.assertTrue(s1 == s6);

        //ntern()方法会查找在常量池中是否存在一份equal相等的字符串,如果有则返回该字符串的引用,如果没有则添加自己的字符串进入常量池。
        Assert.assertTrue(s1 == s7);

        Assert.assertFalse(s1 == s10);

        // 只要有一个是变量，就是新的对象，不在常量池
        Assert.assertFalse(s1 == "ja" + s9);
        // 字面量
        Assert.assertTrue(s1 == "ja" + "va");


    }
}
