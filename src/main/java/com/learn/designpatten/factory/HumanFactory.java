package com.learn.designpatten.factory;

public class HumanFactory implements Factory {
    @Override
    public Food createFood() {
        return  new Blanaer();
    }
}
