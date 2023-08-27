package com.itbaizhan.innerClass;

// 测试内部类的用法
public class Outer {
    private int age=10;
    public void show(){
        System.out.println("Outer.show");
        System.out.println(age);
    }

    public class Inner{
        // 内部类中可以声明与外部类同名的属性与方法
        int age = 20;
        public void show(){
            System.out.println("Inner.show");
            System.out.println(age);

            // 非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类成员。
            System.out.println(Outer.this.age);
            Outer.this.show();
        }
    }
}
