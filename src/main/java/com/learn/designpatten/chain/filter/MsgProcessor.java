package com.learn.designpatten.chain.filter;

public class MsgProcessor {
    private String msg;
    //Filter filters[] = {new HtmlFilter(), new SesitiveFilter()};
    FilterChain filterChain = new FilterChain();

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        String r = msg;
        r = filterChain.doFilter(r);
        return r;
    }
}
