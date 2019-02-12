package com.learn.designpatten.strategy.sale;

import com.learn.designpatten.strategy.encrypt.Base64Encrypt;

public class StrategyTest {
    public static void main(String args[]){
        Context context = new Context(new Promotion());
        double price = 100;
        price =context.sale(price);
        System.out.print(price);
    }
}
