package com.learn.designpatten.decorator;

public class RunCar implements Car {


    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void show() {
        this.run();
    }
}
