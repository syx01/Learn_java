package com.learn.designpatten.decorator;

public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    public  void swim(){
        System.out.println("可以游");
    }
}
