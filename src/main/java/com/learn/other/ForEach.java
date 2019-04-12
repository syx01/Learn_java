package com.learn.other;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {

    List<String> list = null;

    @Before
    public void before() {
        list = new ArrayList();
    }

    @Test
    public void test1() {
        //方案一

        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.print(list);

    }

    @Test
    public void test2() {
        //方案一
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            if ("1".equals(item)) {
                list.remove(item);
            }
        }
        System.out.print(list);

    }

    @Test
    public void test3() {
        Iterator<String> iterator = list.iterator();
        do {
            if (!iterator.hasNext()) {
                break;
            }
            String item = iterator.next();
            if ("2".equals(item)) {
                list.remove(item);
            }
        } while (true);

        System.out.print(list);

    }

    @Test
    public void test4(String[] args) {
        Iterator<String> iterator1 = list.iterator();
        do {
            if (!iterator1.hasNext()) {
                break;
            }
            String item = iterator1.next();
            if ("2".equals(item)) {
                iterator1.remove();
            }
        } while (true);

    }
}


