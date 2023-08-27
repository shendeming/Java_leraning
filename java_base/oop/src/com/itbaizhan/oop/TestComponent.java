package com.itbaizhan.oop;

/**
 * 测试组合
 */

public class TestComponent {
}

class Person2 {
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }
}

//class Student2 extends Person{
class Student2 {  // 使用“组合”实现代码复用
    Person2 person2 = new Person2();  //将父类对象作为子类的属性
    String major;

    public void study(){
        System.out.println("学习！");
        person2.rest();
        System.out.println(this.person2.name);
    }

    // 带参构造器，构造方法重载
    public Student2(String name, int height, String major){
        this.person2.name = name;
        this.person2.height = height;
        this.major = major;
    }
}
