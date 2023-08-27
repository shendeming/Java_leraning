package com.itbaizhan.innerClass;

public class TestInner1 {
    public static void main(String[] args) {
        Outer o = new Outer();   // 创建外部类
        // 先创建外部类实例，然后使用该外部类实例创建内部类实例
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
