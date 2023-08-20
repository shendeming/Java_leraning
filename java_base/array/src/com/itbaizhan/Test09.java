package com.itbaizhan;

import java.lang.reflect.Array;
import java.util.Arrays;

// 测试 Comparable 接口
public class Test09 {
    public static void main(String[] args) {
        Man2[] msMans = {
                new Man2(3, "a"),
                new Man2(60, "b"),
                new Man2(2, "c")};

        // 使用 Arrays 类对数组元素进行排序
        Arrays.sort(msMans);

        System.out.println(Arrays.toString(msMans));
    }
}


class Man2 implements Comparable {
    int age;
    int id;
    String name;

    public Man2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public int compareTo(Object o) {
        Man2 man2 = (Man2) o;
        if (this.age < man2.age) {
            return -1;
        }
        if (this.age > man2.age) {
            return 1;
        }
        return 0;
    }
}