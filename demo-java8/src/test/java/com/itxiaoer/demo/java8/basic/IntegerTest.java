package com.itxiaoer.demo.java8.basic;

import org.junit.Test;

/**
 * java中基本类型的包装类的大部分都实现了常量池技术，即Byte,Short,Integer,Long,Character,Boolean。
 * <p>
 * 这5种包装类默认创建了数值[-128，127]的相应类型的缓存数据，但是超出此范围仍然会去创建新的对象。
 * 两种浮点数类型的包装类Float,Double并没有实现常量池技术。
 *
 * @author : liuyk
 */
@SuppressWarnings("all")
public class IntegerTest {
    private int i1 = 127;
    private Integer i2 = 127;
    private Integer i3 = new Integer(127);
    private Integer i4 = new Integer(127);
    private Integer i5 = new Integer(0);
    private Integer i6 = i3 + i5;
    private Integer i7 = i3 + 0;


    private int i8 = 10;
    private Integer i9 = 10;
    private Integer i10 = new Integer(10);
    private Integer i11 = new Integer(10);
    private Integer i12 = new Integer(0);
    private Integer i13 = i11 + i12;
    private Integer i14 = i11 + 0;


    @Test
    public void excute() {


    }


}
