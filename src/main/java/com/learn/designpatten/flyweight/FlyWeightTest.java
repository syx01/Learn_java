package com.learn.designpatten.flyweight;

public class FlyWeightTest {

    PersonFactoy personFactoy = new PersonFactoy();
    String name = "sunyongxing";
    Person person = personFactoy.getPerson(name);

}
