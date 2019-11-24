package com.learn.thread.TheadTest;

public class TestJoin {

  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 60; i++) {
          System.out.println(String.format("子线程1：i=%s", i));
        }
      }
    });
    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 30; i++) {
          System.out.println(String.format("子线程2：i=%s", i));
        }
      }
    });

    thread1.start();
    thread2.start();
    //正常情况下是交替执行。主线程让子线程先执行完以后，自己再执行.
    thread1.join();
    thread2.join();

    for (int i = 0; i < 30; i++) {
      System.out.println(String.format("主线程3：i=%s", i));
    }
  }

}
