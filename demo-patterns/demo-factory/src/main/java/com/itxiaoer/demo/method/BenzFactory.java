package com.itxiaoer.demo.method;

import com.itxiaoer.demo.BenzCar;
import com.itxiaoer.demo.Car;

/**
 * 奔驰工厂类
 *
 * @author : liuyk
 */

public class BenzFactory implements CarFactory {
    @Override
    public Car create() {
        return new BenzCar();
    }
}
