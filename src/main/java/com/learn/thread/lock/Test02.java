package com.learn.thread.lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test02 {

  private ArrayList<Integer> arrayList = new ArrayList<Integer>();

  /**
   * 注意这个地方
   */
  private Lock lock = new ReentrantLock();

  public static void main(String[] args) {
    final Test02 test = new Test02();

    new Thread() {
      @Override
      public void run() {
        test.insert(Thread.currentThread());
      }

      ;
    }.start();

    new Thread() {
      public void run() {
        test.insert(Thread.currentThread());
      }

      ;
    }.start();
  }

  private void insert(Thread thread) {
    lock.lock();
    try {
      System.out.println(thread.getName() + "得到了锁");
      for (int i = 0; i < 5; i++) {
        arrayList.add(i);
      }
    } catch (Exception e) {
      // TODO: handle exception
    } finally {
      System.out.println(thread.getName() + "释放了锁");
      lock.unlock();
    }
  }
}