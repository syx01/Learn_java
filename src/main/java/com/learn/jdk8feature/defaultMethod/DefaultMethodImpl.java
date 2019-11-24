package com.learn.jdk8feature.defaultmethod;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-03-30 16:11
 **/

public class DefaultMethodImpl implements  DefaultMethod{

  @Override
  public void print() {
    System.out.printf("DefaultMethodImpl");
  }
  @Override
  public void defaultMethod() {
    System.out.printf("DefaultMethodImpl");
  }
  public static void main(String[] args) {
    DefaultMethod defaultMethod = new DefaultMethodImpl();
    defaultMethod.defaultMethod();
  }
}
