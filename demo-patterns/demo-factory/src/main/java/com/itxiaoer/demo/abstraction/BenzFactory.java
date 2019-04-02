package com.itxiaoer.demo.abstraction;

import com.itxiaoer.demo.BenzCar;
import com.itxiaoer.demo.BenzPlane;
import com.itxiaoer.demo.Car;
import com.itxiaoer.demo.Plane;

/**
 * 奔驰工厂类
 *
 * @author : liuyk
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BenzCar();
    }

    @Override
    public Plane createPlane() {
        return new BenzPlane();
    }
}
