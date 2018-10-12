package com.itxiaoer.demo.jvm;

import java.util.concurrent.TimeUnit;

/**
 * 1、对象可以在GC时自我拯救。
 * 2、这种自我拯救只有一次，一个对象的finalize方法最多只被系统调用一次。
 *
 * @author : liuyk
 */
@SuppressWarnings("all")
public class FinalizeGc {
    private static FinalizeGc SAVE_HOOK = null;


    public static void main(String[] args) throws Exception {

        SAVE_HOOK = new FinalizeGc();
        // 第一次自我拯救，成功
        SAVE_HOOK = null;
        System.gc();

        // finalize优先级很低，等待执行
        TimeUnit.MILLISECONDS.sleep(500);
        print();

        // 第二次自我拯救，失败
        SAVE_HOOK = null;
        System.gc();
        // finalize优先级很低，等待执行
        TimeUnit.MILLISECONDS.sleep(500);
        print();

    }

    public static void print() {
        if (SAVE_HOOK != null) {
            System.out.println("yes, i am still live.");
        } else {
            System.out.println("no, i am dead. ");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed.");
        // 自我拯救
        SAVE_HOOK = this;
    }
}
