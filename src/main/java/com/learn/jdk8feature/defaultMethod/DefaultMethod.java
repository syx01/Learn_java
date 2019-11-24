package com.learn.jdk8feature.defaultmethod;

/**
 * @author Administrator
 */
@FunctionalInterface
public interface DefaultMethod {

  void print();

  default void defaultMethod() {
    System.out.print("DefaultMethod");
  }
}


