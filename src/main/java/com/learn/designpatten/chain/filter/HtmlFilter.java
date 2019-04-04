package com.learn.designpatten.chain.filter;

public class HtmlFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        String result = msg.replace("<", "[").replace(">", "]");
        return result;
    }
}
