package com.learn.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLocK 测试
 *
 * @author sunyongxing
 */
public class InterruptTest {

  private Lock lock = new ReentrantLock();

  public static void main(String[] args) {
    InterruptTest test = new InterruptTest();
    MyThread thread1 = new MyThread(test);
    thread1.setName("thread1");
    MyThread thread2 = new MyThread(test);
    thread2.setName("thread2");

    thread1.start();
    thread2.start();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread2.interrupt();
  }

  public void insert(Thread thread) throws InterruptedException {
    //注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
    if(lock.tryLock(10,TimeUnit.SECONDS)){
      try {
        System.out.println(thread.getName() + "得到了锁");
        long startTime = System.currentTimeMillis();
        for (; ; ) {
          if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE) {
            break;
          }
          //插入数据
        }
      } finally {
        System.out.println(Thread.currentThread().getName() + "执行finally");
        lock.unlock();
        System.out.println(thread.getName() + "释放了锁");
      }
    }else {
      System.out.println(thread.getName() + "获取锁失败了");
    }

  }
}

class MyThread extends Thread {

  private InterruptTest test = null;

  public MyThread(InterruptTest test) {
    this.test = test;
  }

  @Override
  public void run() {

    try {
      test.insert(Thread.currentThread());
    } catch (InterruptedException e) {
      System.out.println(Thread.currentThread().getName() + "被中断");
    }
  }
}