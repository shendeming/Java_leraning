package com.bjsxt;

// 测试泛型接口
public class Test2 {
    public static void main(String[] args) {
        IgenericImpl igeneric = new IgenericImpl();
        String name = igeneric.getName("oldshen");
        System.out.println(name);

//        Igeneric igeneric1 = new IgenericImpl();
        Igeneric<String> igeneric1 = new IgenericImpl();
        String name1 = igeneric1.getName("newshen");
        System.out.println(name1);
    }
}
