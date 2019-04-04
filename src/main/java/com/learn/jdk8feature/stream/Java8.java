package com.learn.jdk8feature.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    List<Integer> transactionsIds =
        transactions.parallelStream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
            .sorted(Comparator.comparing(Transaction::getValue).reversed())
            .map(Transaction::getId)
            .collect(Collectors.toList());
    System.out.println(transactionsIds);//[6, 5, 3, 1]

  }
}
