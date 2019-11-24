package com.learn.designpatten.singleton;

/**
 * 单例模式：静态代码块
 *
 * @author Administrator
 */
public class SingletonEnum {

  public static void main(String[] args) {
    SingletonEnum singletonEnum = SingletonEnum.getInstance();
  }

  private SingletonEnum() {
     // throw new RuntimeException("防止反射破解");
  }


  private static SingletonEnum getInstance() {
    return Singleton.INSTANSE.getInstanse();
  }


  private enum Singleton {
    /**
     *
     */
    INSTANSE;

    private SingletonEnum singleton;

    /**
     * JVM保证了方法只调用一次
     */
    Singleton() {
      singleton = new SingletonEnum();
    }

    public SingletonEnum getInstanse() {
      return singleton;
    }
  }

}
