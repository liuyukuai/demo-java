package com.itxiaoer.demo.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @author : liuyk
 */
public class JvmInfo {

    public static void main(String[] args) {
        List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
        System.out.println(garbageCollectorMXBeans);
    }
}
