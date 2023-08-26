package com.bjsxt3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //实例化HashMap 容器
        Map<String,String> map1 = new HashMap<>();

        //添加元素
        map1.put("a","A");
        String value = map1.put("a","B");
        System.out.println(value);

        //获取元素
        System.out.println("----方式1：通过get方法获取元素-----");
        String val = map1.get("a");
        System.out.println(val);

        System.out.println("----方式2：通过keySet方法获取元素-----");
        map1.put("b","B");
        map1.put("c","C");
        map1.put("d","D");

        //获取HashMap 容器中所有的元素，可以使用keySet 方法与get 方法一并完成。
        Set<String> keys1 = map1.keySet();
        for(String key1:keys1){
            String v1 = map1.get(key1);
            System.out.println(key1+" ---- "+v1);
        }

        System.out.println("----方式3：通过entrySet方法获取Map.Entry类型获取元素-----");
        Set<Map.Entry<String,String>> entrySet = map1.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            String key = entry.getKey();
            String v = entry.getValue();
            System.out.println(key+" ---------- "+v);
        }

        System.out.println("----Map容器的并集操作-----");
        Map<String,String> map2 = new HashMap<>();
        map2.put("f","F");
        map2.put("c","cc");
        map2.putAll(map1);
        Set<String> keys2 = map2.keySet();
        for(String key2:keys2){
            String v2 = map2.get(key2);
            System.out.println(key2+" ---- "+v2);
        }

        System.out.println("----Map容器的删除元素----");
        String v = map1.remove("d");
        System.out.println(v);
        Set<String> keys3 = map1.keySet();
        for(String key:keys3){
            System.out.println("key: "+key+" Value: "+map1.get(key));
        }

        System.out.println("----判断key 或value 是否存在----");
        boolean flag = map1.containsKey("a");
        System.out.println(flag);

        boolean flag2 = map1.containsValue("B");
        System.out.println(flag2);
    }
}
