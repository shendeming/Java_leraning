package com.itbaizhan.testinterface;

public class Test {
    public static void main(String[] args) {
        Angel a = new Angel();
        a.fly();
        a.helpOther();
        System.out.println(Volant.Fly_HIGHT);

        // 类似于向上转型，父类引用指向子类对象
        Volant a2 = new Angel();
        a2.fly();


        System.out.println("========测试默认方法=========");
        TestDefault td = new TestDefaultImpl01();
        td.printInfo();
        td.moren();

        // 静态方法直接从属于接口（接口也是类，一种特殊的类），可以通过接口名TestDefault调用。
        System.out.println("========测试静态方法=========");
        TestDefault.testStatic01();

        // 可以通过子类名TestDefaultImpl01直接调用
        TestDefaultImpl01.testStatic01();
    }
}
