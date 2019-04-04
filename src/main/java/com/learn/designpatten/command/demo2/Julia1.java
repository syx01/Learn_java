package com.learn.designpatten.command.demo2;

import com.learn.designpatten.command.demo1.Command;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-02-23 15:01
 **/

public class Julia1 {

  public static void main(String[] args) {
    //创建接收者对象
    AudioPlayer audioPlayer = new AudioPlayer();
    //创建命令对象
    Command playCommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopCommand = new StopCommand(audioPlayer);
    //创建请求者对象
    Keypad keypad = new Keypad();
    keypad.setPlayCommand(playCommand);
    keypad.setRewindCommand(rewindCommand);
    keypad.setStopCommand(stopCommand);
    //测试
    keypad.play();
    keypad.rewind();
    keypad.stop();
    keypad.play();
    keypad.stop();
  }
}
