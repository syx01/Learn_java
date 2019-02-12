
package com.learn.designpatten.observer;
/**
 * 测试
 */
public class observerTest {
    public static void main(String[] args) {
    	// 创建一个主题对象
    	Person number = new Person();
    	// 为主题对象增加订阅者
    	number.addObserver(new PersonObserver());
    	// 修改主题对象
    	number.setName("1");
    	number.setSex("2");
    }
}
