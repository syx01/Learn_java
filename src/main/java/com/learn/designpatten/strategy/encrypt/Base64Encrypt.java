package com.learn.designpatten.strategy.encrypt;

public class Base64Encrypt implements Encrypt {
    @Override
    public void encrypt() {
        System.out.print("Base64加密");
    }
}
