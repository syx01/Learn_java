package com.learn.thread.threadlocal;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-05-02 23:00
 **/

public class ThreadLocalTest01 {

  private static  ThreadLocal<Integer> test1  = new ThreadLocal<Integer>();

  public static void main(String[] args) {

    test1.set(100);

    System.out.println(test1.get());
  }

}


