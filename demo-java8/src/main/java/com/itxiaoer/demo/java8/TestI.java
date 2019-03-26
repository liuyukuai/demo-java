package com.itxiaoer.demo.java8;

/**
 * i++ 和++i 的性能问题，
 * 代码完全一样，没有性能区别
 */
//public void f1();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=2, locals=2, args_size=1
//        0: iconst_0
//        1: istore_1
//        2: iload_1
//        3: bipush        10
//        5: if_icmpge     14
//        8: iinc          1, 1
//        11: goto          2
//        14: return
//        LineNumberTable:
//        line 13: 0
//        line 16: 14
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        2      12     1     i   I
//        0      15     0  this   Lcom/itxiaoer/demo/java8/TestI;
//        StackMapTable: number_of_entries = 2
//        frame_type = 252 /* append */
//        offset_delta = 2
//        locals = [ int ]
//        frame_type = 250 /* chop */
//        offset_delta = 11
//
//public void f2();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=2, locals=2, args_size=1
//        0: iconst_0
//        1: istore_1
//        2: iload_1
//        3: bipush        10
//        5: if_icmpge     14
//        8: iinc          1, 1
//        11: goto          2
//        14: return
//        LineNumberTable:
//        line 20: 0
//        line 23: 14
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        2      12     1     i   I
//        0      15     0  this   Lcom/itxiaoer/demo/java8/TestI;
//        StackMapTable: number_of_entries = 2
//        frame_type = 252 /* append */
//        offset_delta = 2
//        locals = [ int ]
//        frame_type = 250 /* chop */
//        offset_delta = 11

/**
 * @author : liuyk
 */
public class TestI {
    public static void main(String[] args) {


    }

    public void f1() {
        for (int i = 0; i < 10; i++) {

        }
    }

    public void f2() {
        for (int i = 0; i < 10; ++i) {

        }
    }
}
