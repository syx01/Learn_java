package com.learn.designpatten.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Car car = new RunCar();
        SwimCarDecorator swimcar = new SwimCarDecorator(car);
        FlyCarDecorator flyCarDecorator = new FlyCarDecorator(swimcar);
        flyCarDecorator.show();
    }
}
