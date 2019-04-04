package com.learn.designpatten.chain.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filterList  = new ArrayList<>(10);
    public FilterChain addFilter(Filter filter){
        filterList.add(filter);
        return  this;
    }

    public  String  doFilter(String str){
        String s = str;
        for(Filter filter : filterList){
            s = filter.doFilter(s);
        }
        return  s;
    }
}
