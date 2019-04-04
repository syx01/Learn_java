package com.learn.designpatten.state.swich;

public class SwitchTest {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switchOn();
        switcher.switchOn();
        switcher.switchOff();
        switcher.switchOff();

    }
}
