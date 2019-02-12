package com.learn.designpatten.strategy.encrypt;

public class StrategyTest {
    public static void main(String args[]){
        Context context = new Context(new Base64Encrypt());
        context.encrypt();
    }
}
