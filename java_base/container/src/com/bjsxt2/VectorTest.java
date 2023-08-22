package com.bjsxt2;

import java.util.List;
import java.util.Vector;

// 区别
// 初始化：1.8版本后ArrayList延迟初始化，Vector立即初始化
// 容器扩容：ArrayList 1.5倍扩容, Vector 2倍扩容
public class VectorTest {
    public static void main(String[] args) {
        // 实例化Vector
        List<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");

        for(int i=0; i<v.size(); i++){
            System.out.println(v.get(i));
        }

        System.out.println("----------------");
        for(String str:v){
            System.out.println(str);
        }
    }
}
