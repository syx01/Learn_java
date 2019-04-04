package com.learn.designpatten.chain.filter1;

public class HtmlFilter implements Filter {
    public String doFilter(String msg) {
        String result = msg.replace("<", "[").replace(">", "]");
        return result;
    }

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace("<", "[").replace(">", "]"));
        filterChain.doFilter(request, response,filterChain);
        response.setResponseStr(response.getResponseStr()+"-->HtmlFilter");
    }
}
