package com.learn.thread.TheadTest;

import java.util.concurrent.TimeUnit;

public class ThreadTest04 {

    public static void main(String[] args) throws InterruptedException {

        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread  = new Thread(new Mini(previous),String.valueOf(i));
            thread.start();
            previous = thread;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName()+" terminate!");
    }


}


class Mini implements Runnable {


    Thread thread = null;

    Mini(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " terminate!");
    }
}