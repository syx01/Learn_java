package com.learn.designpatten.singleton;

/**
 * 单例模式：懒汉模式
 */
public class Singleton1 {
    private Singleton1 singleton;

    private Singleton1() {
        if (singleton!=null){
            throw new RuntimeException("防止反射破解");
        }
    }

    /**
     * 第一种方式：保证线程安全那就直接在方法上加同步锁
     *
     * @return
     */
    public synchronized Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
            return singleton;
        } else {
            return singleton;
        }
    }

    /**
     * 第二种方式:双重检查
     *
     * @return
     */
    public synchronized Singleton1 getInstance1() {
        if (singleton == null) {
            synchronized (this) {
                if (singleton == null){
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;

    }
}
