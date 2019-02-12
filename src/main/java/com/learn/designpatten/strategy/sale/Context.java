package com.learn.designpatten.strategy.sale;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double sale(double price) {
        return this.strategy.sale(price);
    }
}
