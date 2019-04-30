package com.itxiaoer.demo;

import com.itxiaoer.spring.context.ApplicationContext;

/**
 * @author : liuyk
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext("application.properties");
        Object bean = context.getBean("");
    }
}
