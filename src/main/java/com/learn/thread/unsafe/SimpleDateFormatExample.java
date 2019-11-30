package com.learn.thread.unsafe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 孙永星
 * @description
 * @date Create in 12:49 2019-11-30
 */
@Slf4j
public class SimpleDateFormatExample {

  private static int threadTotal = 200;
  private static int clientTotal = 5000;
private  static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

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
  }

  private static void add() {
    try {
      simpleDateFormat.parse("2019-01-01");
    } catch (ParseException e) {
      log.error("",e);
    }
  }

}
