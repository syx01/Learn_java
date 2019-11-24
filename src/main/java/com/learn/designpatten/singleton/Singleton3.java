package com.learn.designpatten.singleton;

/**
 * 单例模式：枚举
 * @author Administrator
 */
public enum Singleton3 {
    /**
     * 
     */
    INSTANCE;

    public void doSomeThing() {
        System.out.println("枚举单例模式");
    }
}
