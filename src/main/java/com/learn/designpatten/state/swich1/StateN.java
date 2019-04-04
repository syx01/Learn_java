package com.learn.designpatten.state.swich1;

public class StateN implements State{

    @Override
    public void switchP() {
        System.out.println("已经是P档位");
    }

    @Override
    public void switchR() {
        System.out.println("切换到R档");
    }

    @Override
    public void switchN() {
        System.out.println("Warning 无法切换到N档");

    }

    @Override
    public void switchD() {
        System.out.println("Warning 无法切换到D档");

    }
}
