package com.learn.designpatten.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton3 singleton3 = Singleton3.INSTANCE;
        singleton3.doSomeThing();

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        System.out.print(singleton2 == singleton21);

    }
}
