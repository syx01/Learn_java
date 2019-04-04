package com.learn.designpatten.state.swich;

public class Switcher {
    private  boolean state = false;
    public  void switchOn(){
        if (state == false){
            state = !state;
            System.out.println("开关状态：开");
        }else {
            System.out.println("Warning:开关已经是开着了");
        }
    }

    public  void switchOff(){
        if (state== true){
            state = !state;
            System.out.println("开关状态：关");
        }else{
            System.out.println("Warning:开关已经是关着了");
        }
    }
}
