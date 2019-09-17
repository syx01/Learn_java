package com.learn.jdk8feature.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;

public class GroupBy {

  public static void main(String[] args) {

    List<Apple> appleList = new ArrayList<Apple>();
    appleList.add(new Apple("1", "green", 100));
    appleList.add(new Apple("2", "green", 200));
    appleList.add(new Apple("3", "red", 300));
    appleList.add(new Apple("4", "red", 400));
    appleList.add(new Apple("4", "red", 400));

    Map list1 = (Map) appleList.stream()
        .peek(apple -> apple.setSize(apple.getSize() * 2))
        .filter(apple -> apple.getSize() > 200)
        .limit(10)
        .distinct()
        .sorted(Comparator.comparing(Apple::getSize))
        .collect(Collectors.toList())
        .stream()
        .collect(Collectors.groupingBy(Apple::getColor, HashMap::new, Collectors.maxBy(
            Comparator.comparing(Apple::getSize))));
  }

}

@Data
@AllArgsConstructor
class Apple {

  String id;
  String color;
  int size;
}