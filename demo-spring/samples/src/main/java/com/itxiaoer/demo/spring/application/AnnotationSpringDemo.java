package com.itxiaoer.demo.spring.application;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liuyk
 */
@Configuration
public class AnnotationSpringDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AnnotationSpringDemo.class);

        context.addApplicationListener(e -> {
            System.err.println(" event : " + e);
        });

        context.refresh();

        context.publishEvent("hello world.");

        context.publishEvent(new MyEvent("hello world."));

//        AnnotationSpringDemo bean = context.getBean(AnnotationSpringDemo.class);

//        System.out.println(bean);

    }

    static class MyEvent extends ApplicationEvent {
        MyEvent(Object source) {
            super(source);
        }
    }
}
