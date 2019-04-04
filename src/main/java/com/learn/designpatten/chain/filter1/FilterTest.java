package com.learn.designpatten.chain.filter1;

import com.learn.designpatten.chain.filter.MsgProcessor;

public class FilterTest {
    public static void main(String[] args) {
        String msg = "大家好 <script> 敏感";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter());
        filterChain.addFilter(new SesitiveFilter());
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getRequestStr());

        System.out.println(response.getResponseStr());

    }
}
