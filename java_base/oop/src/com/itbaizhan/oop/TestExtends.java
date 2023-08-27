package com.itbaizhan.oop;

/**
 * 测试继承
 */
public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("沈德明", 174, "java");

        // instanceof判断对象是否由该类创建
        System.out.println(s1 instanceof Person);
        System.out.println(s1 instanceof Student);
    }
}

class Person {
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }
}

class Student extends Person{
//    String name;
//    int height;
    String major;
//    public void rest(){
//        System.out.println("休息一会！");
//    }

    public void study(){
        System.out.println("学习！");
        rest();
        System.out.println(this.name);
    }

    // 带参构造器，构造方法重载
    public Student(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
}
