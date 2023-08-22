package com.bjsxt;

// 测试泛型类
public class Test {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.setFlag("admin");
        String flag = generic.getFlag();
        System.out.println(flag);

        Generic<Integer> generic1 = new Generic<>();
        generic1.setFlag(100);
        Integer flag1 = generic1.getFlag();
        System.out.println(flag1);
    }
}
 