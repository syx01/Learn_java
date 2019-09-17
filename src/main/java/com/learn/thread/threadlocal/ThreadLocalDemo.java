package com.learn.thread.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chengxiao
 * @date 2016/12/12
 */
public class ThreadLocalDemo {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      final Thread t = new Thread(() -> System.out.println("当前线程:" + Thread.currentThread().getName() + ",已分配ID:" + ThreadId.get()));
      t.start();
    }
  }

  static class ThreadId {

    /**
     * 一个递增的序列，使用AtomicInger原子变量保证线程安全
     */

    private static final AtomicInteger NEXT_ID = new AtomicInteger(0);
    /**
     * 线程本地变量，为每个线程关联一个唯一的序号
     */
    private static final ThreadLocal<Integer> THREAD_ID =
        new ThreadLocal<Integer>() {
          @Override
          protected Integer initialValue() {
            //相当于nextId++,由于nextId++这种操作是个复合操作而非原子操作，会有线程安全问题(可能在初始化时就获取到相同的ID，所以使用原子变量
            return NEXT_ID.getAndIncrement();
          }
        };

    /**
     * 返回当前线程的唯一的序列，如果第一次get，会先调用initialValue，后面看源码就了解了
     * @return
     */
    public static int get() {
      return THREAD_ID.get();
    }
  }
}