package com.itxiaoer.spring.beans;

import java.util.List;

/**
 * @author : liuyk
 */
public class BeanDefinitionReader {

    private String[] locations;

    public BeanDefinitionReader(String[] locations) {
        this.locations = locations;
    }

    public List<String> loadBeanDefinitions() {
        return null;
    }
}
