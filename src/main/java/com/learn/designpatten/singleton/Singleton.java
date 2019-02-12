package com.learn.designpatten.singleton;

/**
 * 单例模式：饿汉模式
 * 不支持延时加载，是线程安全的
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    //需要私有化构造方法，这样就不允许直接new这个对象了
    private Singleton() {

    }
    //提供一个获取对象的方法
    public Singleton getInstance() {
        return singleton;
    }
}
