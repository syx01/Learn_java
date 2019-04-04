package com.learn.designpatten.chain.filter;

public class SesitiveFilter implements  Filter{
    @Override
    public String doFilter(String msg) {
        return msg.replace("敏感","哈哈");
    }
}
