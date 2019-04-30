package com.itxiaoer.spring.beans;

/**
 * @author : liuyk
 */
public interface BeanFactory {
    /**
     * 通过名称查询bean
     *
     * @param name name
     * @return beans
     */
    Object getBean(String name);

    /**
     * 通过类型查询bean
     *
     * @param clazz clazz
     * @param <T>   t
     * @return t
     */
    <T> T getBean(Class<T> clazz);
}
