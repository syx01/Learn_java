package com.learn.thread.pre;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 */
@Slf4j
public class CountExample {

  private static int threadTotal = 200;
  private static int clientTotal = 5000;
  private static long count = 0;

  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    //信号量，表示同一时刻允许最大并发线程数量
    final Semaphore semaphore = new Semaphore(threadTotal);
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
      });

    }
    exec.shutdown();
    log.info("count:{}", count);
  }

  private static void add() {
    count++;
  }

}
