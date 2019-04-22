package com.learn.thread.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {


    /**
     * 普通的HashMap是非线程安全的
     */
    @Test
    public void testHashMap() {
        Map map = new HashMap<String, String>();
        map.put("1", "1");
        map.put("2", "2");
        System.out.println(map);
    }

    /**
     * HashTable是线程安全的，但是因为使用的是synchronized，所以同时只能一个线程操作Map
     */
    @Test
    public void testHashTable() {
        Hashtable map = new Hashtable<String, String>();
        map.put("1", "1");
        map.put("2", "2");
        System.out.println(map);
    }

    /**
     *   ConcurrentHashMap采用的是Segment分段锁的形式，不仅是线程安全，而且也是支持多线程操作   *
     */
    @Test
    public void testConcurrentHashMap() {
        ConcurrentHashMap map = new ConcurrentHashMap<String, String>();
        map.put("1", "1");
        map.put("2", "2");
        System.out.println(map);
    }
}
