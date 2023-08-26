package com.bjsxt4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 使用Iterator 迭代Set 接口类型容器
 */
public class IteratorSetTest {
    public static void main(String[] args) {
        //实例化Set 类型的容器
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        //方式一：通过while 循环
        //获取迭代器对象
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("-------------------------");

        //方式二：通过for 循环
        for(Iterator<String> it = set.iterator();it.hasNext();){
            String value = it.next();
            System.out.println(value);
        }
    }
}
