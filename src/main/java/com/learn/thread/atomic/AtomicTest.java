package com.learn.thread.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import javax.persistence.criteria.CriteriaBuilder.In;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子性：
 */
public class AtomicTest {
    @Test
    public void TestAtomicInteger(){
        AtomicInteger int1 = new AtomicInteger(10);
        int a  = int1.get();
        int1.getAndIncrement();
        System.out.println(a);

        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);
        atomicIntegerArray.getAndDecrement(1);
        atomicIntegerArray.set(0,1);
        atomicIntegerArray.compareAndSet(0,1,2);
        System.out.println(atomicIntegerArray.get(0));

        AtomicReference<Integer> atomicReference = new AtomicReference<Integer>();
        atomicReference.compareAndSet(0,1);
        atomicReference.set(10);
        atomicReference.getAndSet(11);
        atomicReference.lazySet(12);
        System.out.println(atomicReference.get());
    }
}
