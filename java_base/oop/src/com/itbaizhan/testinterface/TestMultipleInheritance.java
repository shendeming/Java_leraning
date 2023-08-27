package com.itbaizhan.testinterface;

// 测试接口的多继承
public class TestMultipleInheritance {
    public static void main(String[] args) {
        C c = new CImpl01();
        c.testA();
        c.testB();
        c.testC();
    }
}

interface A{
    void testA();
}
interface B{
    void testB();
}

/* 接口可以多继承：接口C继承接口A和B */
interface C extends A,B{
    void testC();
}

class CImpl01 implements C{

    @Override
    public void testA() {
        System.out.println("CImpl01.testA");
    }

    @Override
    public void testB() {
        System.out.println("CImpl01.testB");
    }

    @Override
    public void testC() {
        System.out.println("CImpl01.testC");
    }
}