package com.learn.designpatten.memento;

/**
 * 备忘录模式
 */
public class MementoTest {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp();
        emp.setAge("10");
        emp.setName("sunyongxing");
        emp.setSal("20000");
        //设置备忘录
        careTaker.setMemento(emp.memento());
        System.out.println(emp.getName());

        //修改
        emp.setName("zhangsan");
        System.out.println(emp.getName());

        //恢复
        emp.recover(careTaker.getMemento());
        System.out.println(emp.getName());
    }
}
