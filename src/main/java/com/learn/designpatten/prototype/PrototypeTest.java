package com.learn.designpatten.prototype;

/**
 * 原型模式
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge("10");
        person.setName("sunyongxing");
        person.setSex("男");

        Person person1 = person.clone();
        person.setName("张三");
        System.out.println(person1.getName());
    }
}
