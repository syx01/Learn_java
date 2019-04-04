package com.learn.jdk8feature.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-04-04 12:55
 **/

public class Java8 {

  public static void main(String[] args) {
    List<Transaction> transactions = new ArrayList<>();
    transactions.add(new Transaction(1, 10, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(3, 30, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(6, 60, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(5, 50, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(2, 20, Transaction.Type.A));
    transactions.add(new Transaction(4, 40, Transaction.Type.C));

    //transactions.stream().sorted(Comparator.comparing(Transaction::getId)).map(w->w.getId()).forEach(System.out::println);
    transactions.stream().sorted(Comparator.comparing(Transaction::getId)).peek(e -> System.out.println("Filtered value: " + e.getId())).collect(Collectors.toList());

/*    List<Integer> transactionsIds =
        transactions.parallelStream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
            .sorted(Comparator.comparing(Transaction::getValue).reversed())
            .map(Transaction::getId)
            .collect(Collectors.toList());
    System.out.println(transactionsIds);//[6, 5, 3, 1]*/

    Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(System.out::println)
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());

    //filter
    Stream.of(1, 2, 3, 4, 5, 6).filter(x -> x < 5).forEach(System.out::println);

    Integer[] sixNums = {1, 2, 3, 4, 5, 6};
    Integer[] evens =
        Stream.of(sixNums).filter(n -> n % 2 == 0).toArray(Integer[]::new);

    //findFirst
    String test = " a b  c ";
    Optional.ofNullable(test).ifPresent(System.out::println);
    Optional.ofNullable(test).get();

    System.out.print(Optional.ofNullable(test).map(String::length).orElse(-1));

    //reduce
    // 这个方法的主要作用是把 Stream 元素组合起来。它提供一个起始值（种子），然后依照运算规则（BinaryOperator），和前面 Stream 的第一个、第二个、第 n 个元素组合。从这个意义上说，字符串拼接、数值的 sum、min、max、average 都是特殊的 reduce。例如 Stream 的 sum 就相当于

    // Integer sum = integers.reduce(0, (a, b) -> a+b); 或

    // Integer sum = integers.reduce(0, Integer::sum);

    // 也有没有起始值的情况，这时会把 Stream 的前面两个元素组合起来，返回的是 Optional。
// 字符串连接，concat = "ABCD"
    String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
    System.out.print(concat);
// 求最小值，minValue = -3.0
    double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
// 求和，sumValue = 10, 有起始值
    int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
// 求和，sumValue = 10, 无起始值
    sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
// 过滤，字符串连接，concat = "ace"
    concat = Stream.of("a", "B", "c", "D", "e", "F").filter(x -> x.compareTo("Z") > 0).reduce("", String::concat);
  }

}
