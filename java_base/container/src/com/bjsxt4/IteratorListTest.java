package com.bjsxt4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用Iterator 迭代List 接口类型容器
 */

public class IteratorListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //获取元素
        //获取迭代器
        Iterator<String> iterator = list.iterator();

        //方式一:在迭代器中，通过while 循环获取元素
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);

        }

        System.out.println("-------------------------------");
        //方法二：在迭代器中，通过for 循环获取元素
        for(Iterator<String> it = list.iterator();it.hasNext();){
            String value = it.next();
            System.out.println(value);
        }
    }
}
