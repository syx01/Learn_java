package com.learn.thread.escape;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 孙永星
 * @description:
 * @date: Create in 22:42 2019-11-29
 */
@Slf4j
public class Escape {

  private int thisCanbeEscape = 0;

  public Escape() {
    new InnerClass();
  }

  private class InnerClass {

    public InnerClass() {
      log.info("{}", Escape.this.thisCanbeEscape);
    }
  }

  public static void main(String args[]) {
    new Escape();
  }

}
