package com.itxiaoer.demo.abstraction;

import com.itxiaoer.demo.*;

/**
 * 奔驰工厂类
 *
 * @author : liuyk
 */
public class BwmFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BwmCar();
    }

    @Override
    public Plane createPlane() {
        return new BwmPlane();
    }
}
