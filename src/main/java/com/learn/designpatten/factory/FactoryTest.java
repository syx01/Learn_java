package com.learn.designpatten.factory;

public class FactoryTest {
    public static void main(String args[]){
        Factory factory = new HumanFactory();
        Food food = factory.createFood();
        food.eat();
    }
}
