package com.learn.thread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-04-21 14:07
 **/

public class DaemonTest {

  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          TimeUnit.SECONDS.sleep(10);
          System.out.println("1");
        } catch (InterruptedException e) {
          e.printStackTrace();
        }finally {
          System.out.print("DaemonTest finally run");
        }
      }
    },"DaemonTest");
    //Daemon线程在执行完毕以后是不会执行finally块中的内容
    thread.setDaemon(true);
    thread.start();
  }

}
