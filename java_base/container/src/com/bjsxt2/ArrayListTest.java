package com.bjsxt2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        // 实例化ArrayList容器
        List<String> list = new ArrayList<>();


        // 1.添加元素
        boolean flag = list.add("shendeming");
        System.out.println(flag);

        boolean flag2 = list.add("123");

        // 索引的数值不能大于元素的个数
//        list.add(3,"new");
        list.add(1,"new");


        // 2.1通过指定索引位置获取元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        // 2.2通过循环获取集合中所用元素
        System.out.println("------2.2------");
        // size():返回集合中元素个数
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        // 3.1根据索引删除元素
        System.out.println("------3.1------");
        String value = list.remove(1);
        System.out.println(value);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        // 3.2删除指定元素
        System.out.println("------3.2------");
        boolean flag3 = list.remove("123");
        System.out.println(flag3);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        // 4.替换元素
        System.out.println("-------4------");
        String val = list.set(0,"sdm");
        System.out.println(val);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        // 5.清空容器
        System.out.println("-------5------");
        list.clear();
        System.out.println(list.size());


        // 6.判断容器是否为空
        System.out.println("-------6------");
        //如果容器为空则返回true，否则返回false
        boolean flag4 = list.isEmpty();
        System.out.println(flag4);


        list.add("sdm1");
        list.add("sdm2");
        list.add("sdm3");
        // 7.判断容器中是否包含指定元素
        System.out.println("-------7------");
        boolean flag5 = list.contains("sdm2");
        System.out.println(flag5);


        list.add("sdm1");
        // 8.1查找元素第一次出现的位置
        System.out.println("-------8.1------");
        // indexOf 方法返回的是元素在容器中第一次出现的位置。
        // 在容器中不存在则返回-1
        int index = list.indexOf("sdm1");
        System.out.println(index);

        // 8.2查找元素最后一次出现的位置
        System.out.println("-------8.2------");
        //  lastIndexOf 方法返回的是元素在容器中最后一次出现的位置，如果元素
        //  在容器中不存在则返回-1
        int lastIndex = list.lastIndexOf("sdm1");
        System.out.println(lastIndex);


        // 9.将单例集合转换为数组
        System.out.println("------9.1-----");
        // 9.1 将ArrayList转换为Object[]
        Object[] arr = list.toArray();
        // 但是不能将转换的数组做强制类型转换。
        for(int i=0; i<arr.length; i++){
            // 不能批量将集合里的元素强转类型，只能一个个获取返回值时强转
            String str = (String)arr[i];
            System.out.println(str);
        }

        System.out.println("------9.2-----");
        // 9.2 将单例集合转换为指定类型数组
        // 但是类型需要参考泛型中的类型。
        String[] arr2 = list.toArray(new String[list.size()]);
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }


        System.out.println("------10-----");
        // 10. 容器的并集操作
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        List<String> b = new ArrayList<>();
        b.add("b");
        b.add("c");
        b.add("d");

        // a并b
        boolean flag6 = a.addAll(b);
        System.out.println(flag6);
        for(String str:a) {
            System.out.println(str);
        }


        System.out.println("------11-----");
        // 11. 容器的交集操作
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");

        List<String> b1 = new ArrayList<>();
        b1.add("b");
        b1.add("c");
        b1.add("d");

        // a交b
        boolean flag7 = a1.retainAll(b1);
        System.out.println(flag7);
        for(String str:a1) {
            System.out.println(str);
        }


        System.out.println("------12-----");
        // 12. 容器的差集操作
        List<String> a2 = new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");

        List<String> b2 = new ArrayList<>();
        b2.add("b");
        b2.add("c");
        b2.add("d");

        // a差b
        boolean flag8 = a2.removeAll(b2);
        System.out.println(flag8);
        for(String str:a2) {
            System.out.println(str);
        }

    }
}
