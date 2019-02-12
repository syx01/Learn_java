package com.learn.designpatten.strategy.encrypt;

public class Md5Encrypt implements Encrypt {

    @Override
    public void encrypt() {
        System.out.print("MD5加密");
    }
}
