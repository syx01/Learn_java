package com.learn.designpatten.chain.filter1;

public class SesitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace("敏感","哈哈"));
        filterChain.doFilter(request, response,filterChain);
        response.setResponseStr(response.getResponseStr()+"-->SesitiveFilter");

    }
}
