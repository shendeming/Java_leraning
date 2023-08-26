package com.bjsxt2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        // 指定位置添加元素
        list.add(2,"aaaa");
        // 指定位置删除元素
        list.remove(2);

        //获取元素
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("-------------------");
        for(String str :list){
            System.out.println(str);
        }

        System.out.println("----------------LinkedList addFirst-------------------");
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.addFirst("a");
        linkedList1.addFirst("b");
        linkedList1.addFirst("c");
        for(String str:linkedList1){
            System.out.println(str);
        }

        System.out.println("----------------LinkedList addLast-------------------");
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.addLast("a");
        linkedList2.addLast("b");
        linkedList2.addLast("c");

        for (String str:linkedList2){
            System.out.println(str);
        }

        System.out.println("----------------LinkedList getFirst getLast-------------------");
        System.out.println(linkedList2.getFirst());
        System.out.println(linkedList2.getLast());

        System.out.println("----------------LinkedList removeFirst removeLast-------------------");
        linkedList2.removeFirst();
        linkedList2.removeLast();
        for (String str:linkedList2){
            System.out.println(str);
        }

        System.out.println("----------------LinkedList pop-------------------");
        linkedList2.addLast("c");
        linkedList2.pop();
        for (String str:linkedList2){
            System.out.println(str);
        }

        System.out.println("----------------LinkedList push-------------------");
        linkedList2.push("h");
        for (String str:linkedList2){
            System.out.println(str);
        }
        System.out.println(linkedList2.isEmpty());
    }

}
