package com.learn.designpatten.memento;

public class Memento {

    private String name;
    private String sal;
    private String age;

    public Memento(Emp emp) {
        this.name = emp.getName();
        this.age = emp.getAge();
        this.sal = emp.getSal();
    }

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
}
