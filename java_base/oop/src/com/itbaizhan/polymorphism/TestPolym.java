package com.itbaizhan.polymorphism;

/**
 * 测试多态
 */
public class TestPolym {
    public static void main(String[] args) {
//        animalCry(new Dog());   // 父类引用指向子类对象
//        animalCry(new Cat());

        //编译类型Animal   运行时类型Dog
        Animal animal = new Dog();   // 向上转型（自动）
        animal.shout();
 //       animal.seeDoor(); //不能使用父类的引用变量调用 Dog 类特有seeDoor() 方法。

        Dog d  = (Dog)animal;    // 向下转型（强制）
        d.seeDoor();

        // 编译不会报错，运行会报异常：ClassCastException
//        Cat c = (Cat)animal;
//        c.catchMouse();

        if (animal instanceof Cat){
            Cat c = (Cat)animal;
            c.catchMouse();
        }
    }

    static void animalCry(Animal a){   // Animal a = new Dog()
        System.out.println("TestPolym.animalCry");
        a.shout();        // 可以出现多态
    }
}
