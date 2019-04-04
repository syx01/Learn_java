package com.learn.designpatten.state.swich1;

public class Switcher {
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private State state;


    public void switchP() {
        state.switchP();
    }

    public void switchR() {
        state.switchR();

    }

    public void switchN() {
        state.switchN();

    }

    public void switchD() {

        state.switchD();

    }

}
