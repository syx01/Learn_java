package com.learn.jdk8feature.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: learn
 * @description:
 * @author: SYX-孙永星
 * @create: 2019-04-04 12:54
 **/

public class Java7 {
  public static void main(String[] args) {
    List<Transaction> transactions = new ArrayList<>();
    transactions.add(new Transaction(1, 10, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(3, 30, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(6, 60, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(5, 50, Transaction.Type.GEOCERY));
    transactions.add(new Transaction(2, 20, Transaction.Type.A));
    transactions.add(new Transaction(4, 40, Transaction.Type.C));

    // JDK 7 发现type为grocery的所有交易
    List<Transaction> groceryTransactions = new ArrayList<>();
    for (Transaction t : transactions) {
      if (t.getType() == Transaction.Type.GEOCERY) {
        groceryTransactions.add(t);
      }
    }
    // 集合排序 交易值降序排序
    Collections.sort(groceryTransactions, new Comparator<Transaction>() {
      @Override
      public int compare(Transaction o1, Transaction o2) {
        return o2.getValue().compareTo(o1.getValue());
      }
    });
    // 交易ID 获取
    List<Integer> transactionIds = new ArrayList<>();
    for (Transaction t : groceryTransactions) {
      transactionIds.add(t.getId());
    }

    System.out.println(transactionIds);//[6, 5, 3, 1]
  }
}
