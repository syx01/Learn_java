package com.learn.designpatten.command.demo3;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-02-23 15:07
 **/

public class Leader1 {
  private Commander commander ;
  public void setCommander(Commander commander) {
    this.commander = commander;
  }

  public void fireCommand() {
    this.commander.fireCommand();
  }
}
