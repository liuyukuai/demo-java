package com.itxiaoer.demo.method;

import com.itxiaoer.demo.BwmCar;
import com.itxiaoer.demo.Car;

/**
 * 奔驰工厂类
 *
 * @author : liuyk
 */

public class BwmFactory implements CarFactory {
    @Override
    public Car create() {
        return new BwmCar();
    }
}
