package com.learn.designpatten.command.demo3;


import com.learn.designpatten.chain.leave.Leader;

/**
 * @program: learn
 * @description: 命令模式
 * @author: SYX-孙永星
 * @create: 2019-02-23 15:06
 **/

public class CommandTest {

  public static void main(String[] args) {
    //毛主席
    Leader1 leader = new Leader1();
    //指挥台
    Commander commander = new Commander();

    leader.setCommander(commander);

    leader.fireCommand();
  }

}
