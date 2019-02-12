
package com.learn.designpatten.observer;

import java.util.Observable;
import java.util.Observer;


public class PersonObserver implements Observer {


    public void update(Observable observable, Object arg) {
        Person person = (Person) observable;
        System.out.println("Data has changed to " + person.getName());
        System.out.println("Data has changed to " + person.getSex());

    }
}
