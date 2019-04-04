package com.learn.designpatten.state;

public class Home {
    private State homeState;
    private String no;
    private String name;
    private String size;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setState(State state) {
        System.out.println("房间状态修改了");
        this.homeState = state;
        this.homeState.handle();
    }

}
