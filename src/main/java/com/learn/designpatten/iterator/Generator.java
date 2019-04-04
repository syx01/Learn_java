package com.learn.designpatten.iterator;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private List<String> list = new ArrayList<String>();

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void add(String item) {
        list.add(item);
    }

    public MyIterator getIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Interator<String> {
        private int cur = 0;

        @Override
        public String next() {
            if (cur < list.size()) {
                String s = list.get(cur);
                cur = cur + 1;
                return s;
            }else {
                return  null;
            }
        }

        @Override
        public boolean hasNext() {

            return cur < list.size();
        }

        @Override
        public String last() {
            return list.get(list.size() -1);
        }

        @Override
        public String first() {
            return list.get(0);
        }
    }

}
