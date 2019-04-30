package com.itxiaoer.spring.beans;

import lombok.Data;

/**
 * bean 的定义类
 *
 * @author : liuyk
 */
@Data
public class BeanDefinition {
    private String name;
    private Class<?> clazz;

}
