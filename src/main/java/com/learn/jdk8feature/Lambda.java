package com.learn.jdk8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-03-30 14:43
 **/

public class Lambda {

  public static void main(String[] args) {

    List<studentInfo> list = new ArrayList();

    list.add(studentInfo.builder().name("1").build());

    list.forEach((s) -> {
      System.out.print(s.getName());
    });

    Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );

  }
}

@Builder
@Data
class studentInfo {

  private String name;
}
