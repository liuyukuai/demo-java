package com.itxiaoer.demo.method;

import com.itxiaoer.demo.Car;

/**
 * 接口
 * 扩展容易，只需要增加相应的工厂类和具体产品，不会影响原来逻辑
 * 如果产品过多，会找出工厂类的泛滥
 *
 * @author : liuyk
 */
public interface CarFactory {
    /**
     * 创建car的方法
     *
     * @return car
     */
    Car create();
}
