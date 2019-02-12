package com.learn.designpatten.memento;

public class Emp {
    private String name;
    private String sal;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Memento memento() {
        return  new Memento(this);
    }

    public void recover(Memento memento) {
        this.age=memento.getAge();
        this.name = memento.getName();
        this.sal = memento.getSal();
    }
}
