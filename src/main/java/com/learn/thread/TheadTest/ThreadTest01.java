package com.learn.thread.TheadTest;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadTest01 {

    @Test
    public  void testThreadMXBean() throws InterruptedException {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos  = threadMXBean.dumpAllThreads(false,false);
        for (ThreadInfo threadInfo1 :threadInfos){
            System.out.println("["+threadInfo1.getThreadId()+"]"+threadInfo1.getThreadName());
        }

        Thread job = new Job();
        job.setName("JOB01");
        job.setPriority(10);
        job.start();
        job.join();
        job.notify();
        job.notifyAll();
        job.interrupt();
        Thread timeWaitind  = new Thread(new TimeWaiting(),"TimeWaiting");

    }

    public static   void main(String args[]) {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B 开始等待 A");
                try {
                    A.join(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printNumber("B");
            }
        });
        B.start();
        A.start();
    }
    private static   void printNumber(String threadName) {
        int i=0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + "print:" + i);
        }
    }

}

class Job extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class  TimeWaiting implements  Runnable{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}