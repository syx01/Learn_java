package com.learn.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-05-02 21:47
 **/

public class LockTest01 {

  public static void main(String[] args) {
    ReentrantLock lock = new ReentrantLock();
    lock.lock();
    try {
      System.out.println(lock.isLocked());

    } catch (Exception e) {

    } finally {

      lock.unlock();
      System.out.println(lock.isLocked());
    }

    if (lock.tryLock()) {
      System.out.println(lock.isLocked());
    }

  }

}
