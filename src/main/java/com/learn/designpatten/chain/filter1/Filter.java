package com.learn.designpatten.chain.filter1;

public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
