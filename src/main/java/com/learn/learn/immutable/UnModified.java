package com.learn.learn.immutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 孙永星
 * @description:
 * @date: Create in 15:19 2019-11-24
 */
public class UnModified {

  private static Map map = new HashMap();

  public static void main(String[] args) {
    map =  Collections.unmodifiableMap(map);
    map.put(1,1);


  }

}
