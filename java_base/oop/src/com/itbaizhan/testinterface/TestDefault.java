package com.itbaizhan.testinterface;

public interface TestDefault {
    void printInfo();

    // 测试接口中的新特性（默认方法）
    default void moren(){
        System.out.println("TestDefault.moren");
        System.out.println("测试默认方法");
        testStatic01(); //接口中默认方法中可以调用静态方法
    }

    // 测试接口中的新特性（静态方法）
    public static void testStatic01(){
//        moren(); //接口中静态方法中不能调用默认方法
        System.out.println("TestDefault.testStatic01");
    }
}

// 抽象方法必须要被实现，默认方法不是。
class TestDefaultImpl01 implements TestDefault{

    @Override
    public void printInfo() {
        System.out.println("TestDefaultImpl01.printInfo");
    }

    // 如果子类中定义了相同名字的静态方法，那就是完全不同的方法了，直接从属于子类。可以通过子类名直接调用。
    public static void testStatic01(){
        System.out.println("TestDefault.testStatic01");
    }
}