package com.itbaizhan.oop;

/**
 * 测试构造方法调用顺序：
 * 测试静态初始化块调用顺序。
 */
public class TestSuper02 {
    public static void main(String[ ] args) {
        System.out.println("开始创建一个ChildClass2对象......");
        new ChildClass2();
    }
}

class FatherClass2 {
    static {
        System.out.println("静态初始化：FatherClass2");
    }

    public FatherClass2() {
        System.out.println("创建FatherClass2");
    }
}

class ChildClass2 extends FatherClass2 {
    static {
        System.out.println("静态初始化：ChildClass2");
    }

    public ChildClass2() {
        System.out.println("创建ChildClass2");
    }
}
