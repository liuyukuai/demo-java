package com.itxiaoer.demo.java8;

/**
 * @author : liuyk
 */
public class TestString {

    public static void main(String[] args) {
        System.out.println(f1());
        // a
    }


    public static String f1() {
        String s = "a";
        try {
            return s ;
        } finally {
            s = "b";
        }
    }

}
