package com.learn.designpatten.singleton;

/**
 * 单例模式：静态代码块
 *
 * @author Administrator
 */
public class Singleton4 {

  static {
    singleton = new Singleton4();
  }

  private Singleton4() {
    if (singleton != null) {
      throw new RuntimeException("防止反射破解");
    }
  }

  private volatile static Singleton4 singleton = null;


  public static Singleton4 getInstance() {
    return singleton;
  }

  public static void main(String[] args) {
    Singleton4 singleton4 = Singleton4.getInstance();
    Singleton4 singleton5 = Singleton4.getInstance();
    System.out.println(singleton4.hashCode());
    System.out.println(singleton5.hashCode());
  }
}
