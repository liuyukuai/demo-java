package com.itxiaoer.demo.observer.mouse;

import com.itxiaoer.demo.observer.EventListener;

/**
 * 鼠标
 *
 * @author : liuyk
 */
public class Mouse implements EventListener {
    public void click() {
        System.out.println("click");
    }
}
