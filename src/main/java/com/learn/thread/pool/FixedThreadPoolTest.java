package com.learn.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。示例代码如下： 因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
 * 定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()。可参考PreloadDataCache。
 */
public class FixedThreadPoolTest {

  public static void main(String[] args) {
    //获取当前服务器的同时可并发的线程数
    System.out.println(Runtime.getRuntime().availableProcessors());
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(8);

    for (int i = 0; i < 100000; i++) {
      final int index = i;
      fixedThreadPool.execute(new Runnable() {


        @Override
        public void run() {
          try {
            System.out.println(index + ":" + Thread.currentThread().getName());
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      });
    }
  }
}
