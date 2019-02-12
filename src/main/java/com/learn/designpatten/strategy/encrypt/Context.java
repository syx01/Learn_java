package com.learn.designpatten.strategy.encrypt;

public class Context{
    private  Encrypt encrypt;
    public Context(Encrypt encrypt){
        this.encrypt = encrypt;
    }

    public void encrypt() {
        this.encrypt.encrypt();
    }
}
