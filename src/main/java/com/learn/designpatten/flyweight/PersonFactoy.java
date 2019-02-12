package com.learn.designpatten.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonFactoy {
    Map<String,Person> personMap;

    public  void PersonFactory(){
        this.personMap = new HashMap<String,Person>();
    }

    public  Person getPerson(String key){
        if (!personMap.containsKey(key)){
            Person person = new Person();
            personMap.put(key, person);
            return person;
        }else {
            return personMap.get(key);
        }

    }
}
