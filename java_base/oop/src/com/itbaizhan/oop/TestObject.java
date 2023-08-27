package com.itbaizhan.oop;

import java.util.Objects;

/**
 * 测试Object
 * 重写toString()
 * 重写equals()
 */
public class TestObject extends Object {
    String name;
    String pwd;
    int id;

    //快捷键：Alt+insert 自动生成构造器
    public TestObject(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    // 重写toString()方法
//    @Override
//    public String toString() {
//        return "账户名："+name+"密码："+pwd;
//    }

    public static void main(String[] args) {
//         TestObject t = new TestObject();
//         System.out.println(t.toString());
//         TestObject t2 = new TestObject();
//         System.out.println(t2.toString());
//         System.out.println(t2); //默认调用toString()方法

        TestObject t3 = new TestObject(1001,"zhangsan", "123456");
        TestObject t4 = new TestObject(1001,"zhangsan", "123456");
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t3.equals(t4));
    }


    // 重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

