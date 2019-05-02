package com.learn.thread.Interrupted;

import java.util.concurrent.TimeUnit;

/**
 * @program: learn
 * @description: 理解中断
 * @author: SYX-孙永星
 * @create: 2019-04-21 14:15
 **/

public class Interrupted {

  public static void main(String[] args) throws InterruptedException {

    Thread sleepThead = new Thread(new SleepRunner(), "SleepRunner");
    Thread busyThead = new Thread(new BusyRunner(), "BusyRunner");
    sleepThead.setDaemon(true);
    busyThead.setDaemon(true);
    sleepThead.start();
    busyThead.start();
    TimeUnit.SECONDS.sleep(5);
    sleepThead.interrupt();
    busyThead.interrupt();
    System.out.println("SleepRunner " + sleepThead.isInterrupted());
    System.out.println("BusyRunner " + busyThead.isInterrupted());

  }

}

class BusyRunner implements Runnable {

  /**
   * When an object implementing interface <code>Runnable</code> is used to create a thread, starting the thread causes the object's
   * <code>run</code> method to be called in that separately executing
   * thread.
   * <p>
   * The general contract of the method <code>run</code> is that it may take any action whatsoever.
   *
   * @see Thread#run()
   */
  @Override
  public void run() {
    while (true) {

    }
  }
}

class SleepRunner implements Runnable {

  /**
   * When an object implementing interface <code>Runnable</code> is used to create a thread, starting the thread causes the object's
   * <code>run</code> method to be called in that separately executing
   * thread.
   * <p>
   * The general contract of the method <code>run</code> is that it may take any action whatsoever.
   *
   * @see Thread#run()
   */
  @Override
  public void run() {
    while (true) {
      try {
        TimeUnit.SECONDS.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}