package com.itbaizhan.abstractClass;

/**
 * 测试抽象类
 * 1. 有抽象方法的类只能定义成抽象类
 * 2. 抽象类不能实例化，即不能用 new 来实例化抽象类。
 * 3. 抽象类可以包含属性、方法、构造方法。但是构造方法不能用来new实例，只能用来被子类调用。
 * 4. 抽象类只能用来被继承。
 * 5. 抽象方法必须被子类实现。
 */
public abstract class Animal {
    int age;
//    public void rest(){};
    public abstract void rest();  //抽象方法：使用abstract修饰的方法，没有方法体，只有声明。
    public abstract void run();

    public void shout(){
        System.out.println("Animal.shout");
    }
}

class Dog extends Animal{

    // 定义的是一种“规范”，就是告诉子类必须要给抽象方法提供具体的实现。
    @Override
    public void rest() {
        System.out.println("Dog.rest");
    }

    @Override
    public void run() {
        System.out.println("Dog.run");
    }
}
