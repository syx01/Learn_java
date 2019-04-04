package com.learn.thread.transdata;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * 一、通过SynchronousQueue方式实现线程间数据传递：
 *
 * 　　线程A与线程B共同持有一个SynchronousQueue的引用，线程B调用take方法，阻塞以等待； 线程A运行后计算出结果，将结果put到queue中;
 */
public class SynchronousQueueTest {
    public static void main(String[] args) throws InterruptedException {

        SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();

        //线程A putThread
        Thread putThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("put thread start");
                try {
                    Thread.sleep(3000);
                    System.out.println("put thread put对象");
                    queue.put(1);
                } catch (InterruptedException e) {
                }
                System.out.println("put thread end");
            }
        });

        //线程B takeThread
        Thread takeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("take thread start");
                try {
                    System.out.println("take thread 等待put对象");
                    System.out.println("take from putThread: " + queue.take());
                } catch (InterruptedException e) {
                }
                System.out.println("take thread end");
            }
        });

        putThread.start();
        takeThread.start();
    }
}