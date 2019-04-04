package com.learn.designpatten.chain.filter;

public class FilterTest {
    public static void main(String[] args) {
        String msg = "大家好 <script> 敏感";
        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new SesitiveFilter());


        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new HtmlFilter());
        filterChain.addFilter(filterChain1);

        msgProcessor.setFilterChain(filterChain);


        msg = msgProcessor.process();
        System.out.println(msg);


    }
}
