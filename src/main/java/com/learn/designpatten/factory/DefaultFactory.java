package com.learn.designpatten.factory;

public class DefaultFactory implements Factory{

    @Override
    public Food createFood(){
        return new Apple();
    }
}
