package com.baizhi.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDubug {

    @Test
    public  void   test1(){
        Map<Integer,String> maps= new HashMap<Integer,String>();
        maps.put(1,"张三");
        maps.put(2,"李四");
        m1();
        maps.put(3,"王五");
        maps.remove(3);
        Set<Integer> keys = maps.keySet();
        for (Integer key : keys) {
            System.out.println(key+"============"+maps.get(key));
        }
    }
    public   void    m1(){
        System.out.println("m1");
    }
}
