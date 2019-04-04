package com.learn.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {

  public static void main(String[] args) {
    /**
     * 延迟三秒
     */
    ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

    scheduledThreadPool.schedule(new Runnable() {

      @Override
      public void run() {
        System.out.println("delay 3 seconds");
      }
    }, 3, TimeUnit.SECONDS);

/**
 * 表示延迟1秒后每3秒执行一次。
 * ScheduledExecutorService比Timer更安全，功能更强大，后面会有一篇单独进行对比。
 */
    scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
      @Override
      public void run() {
        System.out.println("delay 1 seconds, and excute every 3 seconds");
      }
    }, 1, 3, TimeUnit.SECONDS);
  }


}
