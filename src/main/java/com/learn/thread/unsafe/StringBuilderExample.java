package com.learn.thread.unsafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: 孙永星
 * @description: StringBuilder是非线程安全的
 * @date :  Create in 11:12 2019-11-30
 */
@Slf4j
public class StringBuilderExample {

  private static int threadTotal = 200;
  private static int clientTotal = 5000;
  private static StringBuilder stringBuilder = new StringBuilder();


  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    //信号量，表示同一时刻允许最大并发线程数量
    final Semaphore semaphore = new Semaphore(threadTotal);
    final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
    for (int i = 0; i < clientTotal; i++) {
      exec.execute(() -> {
        try {
          //占用一个通道
          semaphore.acquire();
          add();
          //释放一个通道
          semaphore.release();
        } catch (InterruptedException e) {
          log.error("exeception", e);
        }
        countDownLatch.countDown();
      });

    }
    try {
      countDownLatch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    exec.shutdown();
    log.info("count:{}", stringBuilder.length());
  }

  private static void add() {
    stringBuilder.append("1");
  }

}