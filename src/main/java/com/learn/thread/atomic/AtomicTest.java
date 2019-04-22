package com.learn.thread.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    @Test
    public void TestAtomicInteger(){
        AtomicInteger int1 = new AtomicInteger(10);
        int a  = int1.get();
        int1.getAndIncrement();
        System.out.println(a);
    }
}
