package com.learn.designpatten.iterator;

public class IteratortTest {
    public static void main(String[] args) {
        Generator g = new Generator();
        g.add("a");
        g.add("b");
        g.add("c");
        Interator interator = g.getIterator();
        while (interator.hasNext()){
            System.out.println(interator.next());
        }
    }
}
