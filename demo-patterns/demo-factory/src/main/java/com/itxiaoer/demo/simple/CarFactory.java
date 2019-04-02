package com.itxiaoer.demo.simple;

import com.itxiaoer.demo.BwmCar;
import com.itxiaoer.demo.BenzCar;
import com.itxiaoer.demo.Car;

/**
 * 简单工厂类
 * 所有创建车的逻辑都在create方法内，增加车的类型需要修改该方法，会影响原有逻辑，扩展困难
 * 调用方只需要知道车的名称，就可以创建，不需要知道创建具体细节
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class CarFactory {


    /**
     * 创建car
     *
     * @param name car名称
     * @return car
     */
    public static Car create(String name) {
        switch (name) {
            case "benz":
                return new BenzCar();
            case "bwm":
                return new BwmCar();
            default:
                throw new IllegalArgumentException("name not exists. ");
        }
    }

}
