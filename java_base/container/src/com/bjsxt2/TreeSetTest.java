package com.bjsxt2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //实例化TreeSet
        Set<String> set = new TreeSet<>();

        //添加元素
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("a");

        //获取元素
        for (String str:set){
            System.out.println(str);
        }


        System.out.println("--------通过元素自身实现比较规则------------");
        Set<Users> set1 = new TreeSet<>();
        Users u = new Users("shendeming",26);
        Users u1 = new Users("admin",25);
        Users u2 = new Users("sdm",26);

        set1.add(u);
        set1.add(u1);
        set1.add(u2);
        for(Users users:set1){
            System.out.println(users);
        }


        System.out.println("--------通过比较器实现比较规则------------");
        Set<Student> set2 = new TreeSet<>(new StudentComparator());
        Student s = new Student("shendeming",26);
        Student s1 = new Student("admin",18);
        Student s2 = new Student("happy",26);

        set2.add(s);
        set2.add(s1);
        set2.add(s2);
        for(Student student:set2){
            System.out.println(student);
        }
    }
}
