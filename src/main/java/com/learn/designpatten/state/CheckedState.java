package com.learn.designpatten.state;

public class CheckedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已经入住了");
    }
}
