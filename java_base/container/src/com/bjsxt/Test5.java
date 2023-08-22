package com.bjsxt;

// 测试泛型方法与可变参数
public class Test5 {
    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        String[] arr = new String[]{"a","b","c"};
        Integer[] arr2 = new Integer[]{1,2,3};

        methodGeneric.method(arr);
        methodGeneric.method(arr2);

    }
}
