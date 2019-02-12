package com.learn.designpatten.facade;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public  Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }


    public void run() {
        systemA.run();
        systemB.run();
        systemC.run();
    }
}
