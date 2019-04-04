package com.learn.designpatten.chain.filter1;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<>(10);

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    int index = 0;


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(index);
        index = index + 1;
        filter.doFilter(request, response, filterChain);

    }
}
