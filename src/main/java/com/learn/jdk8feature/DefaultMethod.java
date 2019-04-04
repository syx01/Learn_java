package com.learn.jdk8feature;

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


