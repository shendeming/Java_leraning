package com.bjsxt;

// 测试泛型方法--静态方法
public class Test4 {
    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        methodGeneric.setName("oldshen");
        methodGeneric.setName(1231233);

        MethodGeneric methodGeneric1 = new MethodGeneric();
        String name = methodGeneric1.getName("newshen");
        Integer name1 = methodGeneric1.getName(123);
        System.out.println(name);
        System.out.println(name1);
    }
}
