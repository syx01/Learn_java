package com.learn.designpatten.strategy.sale;

public class Promotion implements Strategy {
    @Override
    public double sale(double price) {
        return price * 0.8;
    }
}
