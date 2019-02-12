package com.learn.designpatten.factory;

public class Apple implements Food{
    @Override
    public void eat() {
        System.out.print("eat "+ Apple.class.getSimpleName());
    }
}
