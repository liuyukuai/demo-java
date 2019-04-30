package com.itxiaoer.spring.context;

import com.itxiaoer.spring.beans.BeanDefinitionReader;
import com.itxiaoer.spring.beans.BeanFactory;

import java.util.List;

/**
 * ApplicationContext
 *
 * @author : liuyk
 */
public class ApplicationContext implements BeanFactory {

    private String[] locations;

    public ApplicationContext(String... locations) {
        this.locations = locations;
        BeanDefinitionReader reader = new BeanDefinitionReader(this.locations);
        List<String> strings = reader.loadBeanDefinitions();
    }


    @Override
    public Object getBean(String name) {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> clazz) {
        return null;
    }
}
