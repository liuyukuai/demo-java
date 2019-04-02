package com.itxiaoer.demo.abstraction;

import com.itxiaoer.demo.Car;
import com.itxiaoer.demo.Plane;

/**
 * 一般用于有产品簇场景
 * *
 *
 * @author : liuyk
 */
public interface CarFactory {

    /**
     * 创建car的方法
     *
     * @return car
     */
    Car createCar();

    /**
     * 创建plane的方法
     *
     * @return plane
     */
    Plane createPlane();
}
