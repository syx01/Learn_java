package com.learn.thread.transdata;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 一、通过SynchronousQueue方式实现线程间数据传递：
 *
 * 　　线程A与线程B共同持有一个SynchronousQueue的引用，线程B调用take方法，阻塞以等待； 线程A运行后计算出结果，将结果put到queue中;
 */
public class ExchangerTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        final Exchanger exchanger = new Exchanger();
        service.execute(new Runnable(){
            public void run() {
                try {                
                    String data1 = "thread-1-data";
                    System.out.println("线程" + Thread.currentThread().getName() +"正在把数据" + data1 +"换出去");
                    Thread.sleep((long)(Math.random()*10000));
                    String data2 = (String)exchanger.exchange(data1);
                    System.out.println("线程" + Thread.currentThread().getName() + "换回的数据为" + data2);
                }catch(Exception e){
                    
                }
            }    
        });
        service.execute(new Runnable(){
            public void run() {
                try {                
                    String data1 = "thread-2-data";
                    System.out.println("线程" + Thread.currentThread().getName() + "正在把数据" + data1 +"换出去");
                    Thread.sleep((long)(Math.random()*10000));                    
                    String data2 = (String)exchanger.exchange(data1);
                    System.out.println("线程" + Thread.currentThread().getName() + "换回的数据为" + data2);
                }catch(Exception e){
                    
                }                
            }    
        });        
    }
}