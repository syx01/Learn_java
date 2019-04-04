package com.learn.designpatten.state.swich1;

public class SwitchTest {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.setState(new StateR());
        switcher.switchD();
    }
}
