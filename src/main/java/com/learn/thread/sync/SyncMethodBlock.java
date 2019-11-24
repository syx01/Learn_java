package com.learn.thread.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 */
@Slf4j
public class SyncMethodBlock {

  public void test() {
    synchronized (this) {
      for (int i = 0; i < 30; i++) {
        log.info("i={}", i);
      }
    }
  }

  public static void main(String[] args) {
    SyncMethodBlock syncCodeBlock = new SyncMethodBlock();
    ExecutorService service = Executors.newCachedThreadPool();
    service.execute(() -> {
      syncCodeBlock.test();
    });
    service.execute(() -> {
      syncCodeBlock.test();
    });
  }
}
