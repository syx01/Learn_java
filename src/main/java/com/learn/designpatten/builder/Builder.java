package com.learn.designpatten.builder;

public class Builder {
    private  final House house = new House();
    public void buildind(){
        this.house.setBase("地基");
        this.house.setBrick("砖头");
        this.house.setName("房子");
    }

    public  House getHouse(){
        return this.house;
    }
}
