package com.learn.learn.immutable;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 孙永星
 * @desctiption finally
 * @date Create in 14:51 2019-11-24
 */
public class FinalExample {

  private final static int fa = 0;
  private final static String fs = "111";
  private final static Map fm = new HashMap();

  public static void main(String[] args) {
//     fa  =1;
//  fs = "22";
//  fm = new HashMap();
    fm.put(1, 1);

  }
}
