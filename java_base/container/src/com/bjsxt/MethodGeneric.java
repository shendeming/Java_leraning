package com.bjsxt;

// 泛型方法--非静态方法/ 静态方法
public class MethodGeneric {
    /** 非静态方法 */
    // 无返回值
    public <T> void setName(T name){
        System.out.println(name);
    }

    // 有返回值
    public <T> T getName(T name){
        return name;
    }

    /** 静态方法 */
    public static <T> void setFlag(T flag){
        System.out.println(flag);
    }

    public static <T> T getFlag(T flag){
        return flag;
    }

    /** 泛型方法与可变参数 */
    public <T> void method(T...args){
        for(T t:args){
            System.out.println(t);
        }
    }
}
