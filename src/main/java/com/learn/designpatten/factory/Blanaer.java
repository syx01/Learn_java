package com.learn.designpatten.factory;

public class Blanaer implements Food {
    @Override
    public void eat() {
        System.out.print("eat  "+ Blanaer.class.getSimpleName());
    }
}
