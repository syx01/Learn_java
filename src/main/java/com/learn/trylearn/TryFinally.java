package com.learn.trylearn;

import java.awt.TextField;

public class TryFinally {

  public static void main(String[] args) {
    System.out.println(test2());
  }

  public static int test() {
    int result = 20;
    try {

      System.out.println("------------try-------------");
      result = result + 80;
      return result;
    } catch (Exception e) {
      System.out.println("------------catch-----------");
    } finally {
      System.out.println("------------finally-----------");
      result = result + 10;
      if (result > 25) {
        System.out.println("result > 25 result=" + result);
      }
    }
    return result;
  }

  public static int test2() {
    int result = 20;
    try {

      System.out.println("------------try-------------");
      result = result + 80;
      return result;
    } catch (Exception e) {
      result = result + 20;
      System.out.println("------------catch-----------");
    } finally {
      System.out.println("------------finally-----------");
      result = result + 10;
      if (result > 25) {
        System.out.println("result > 25 result=" + result);
      }
      return result;
    }
    // return result;
  }

  public static int test3() {
    int result = 20;
    try {

      System.out.println("------------try-------------");
      result = result / 0;
      result = result + 80;
      return result;
    } catch (Exception e) {
      result = result + 20;
      System.out.println("------------catch-----------");
    } finally {
      System.out.println("------------finally-----------");
      result = result + 10;
      if (result > 25) {
        System.out.println("result > 25 result=" + result);
      }
      return result;
    }
    // return result;
  }
}
