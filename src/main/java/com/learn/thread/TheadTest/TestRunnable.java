package com.learn.thread.TheadTest;

public class TestRunnable {

  public static void main(String[] args) {
    ThreadRunable runable = new ThreadRunable();
    Thread thread = new Thread(runable);
    thread.start();
  }
}
