package com.learn.designpatten.builder;

/**
 * 建造者模式
 */
public class BuildTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.buildind();
        House house = builder.getHouse();
        System.out.print(house.getName());
    }
}
