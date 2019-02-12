package com.learn.designpatten.singleton;

/**
 * 单例模式：静态内部类
 * 延时加载，是线程安全的
 */
public class Singleton2 {

    private static class SingltonInstance

    {
        private static final Singleton2 instance = new Singleton2();
    }

    //需要私有化构造方法，这样就不允许直接new这个对象了
    private Singleton2() {

    }

    //提供一个获取对象的方法
    public static Singleton2 getInstance() {
        return SingltonInstance.instance;
    }
}
