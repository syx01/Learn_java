package com.learn.thread.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 　不过要注意的是，如果有一个线程已经占用了读锁，则此时其他线程如果要申请写锁，则申请写锁的线程会一直等待释放读锁。
 *
 * 　　如果有一个线程已经占用了写锁，则此时其他线程如果申请写锁或者读锁，则申请的线程会一直等待释放写锁。
 *
 * 　　关于ReentrantReadWriteLock类中的其他方法感兴趣的朋友可以自行查阅API文档。
 */
public class WriteLockTest {

  private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

  public static void main(String[] args) {
    final WriteLockTest test = new WriteLockTest();

    new Thread() {
      @Override
      public void run() {
        test.get(Thread.currentThread());
      }

      ;
    }.start();

    new Thread() {
      @Override
      public void run() {
        test.get(Thread.currentThread());
      }

      ;
    }.start();

  }

  public void get(Thread thread) {
    rwl.writeLock().lock();
    try {
      long start = System.currentTimeMillis();

      while (System.currentTimeMillis() - start <= 1) {
        System.out.println(thread.getName() + "正在进行读操作");
      }
      System.out.println(thread.getName() + "读操作完毕");
    } finally {
      rwl.writeLock().unlock();
    }
  }
}