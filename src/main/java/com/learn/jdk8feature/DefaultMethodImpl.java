package com.learn.jdk8feature;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-03-30 16:11
 **/

public class DefaultMethodImpl implements  DefaultMethod{

  @Override
  public void print() {

  }

  public static void main(String[] args) {
    DefaultMethod defaultMethod = new DefaultMethodImpl();
    defaultMethod.defaultMethod();
  }
}
