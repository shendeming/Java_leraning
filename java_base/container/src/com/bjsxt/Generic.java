package com.bjsxt;

// 泛型类
public class Generic<T> {
    private T flag;

    public void setFlag(T flag){
        this.flag = flag;
    }

    public T getFlag(){
        return this.flag;
    }

    // 静态方法无法访问类上定义的泛型
//    public static T demo(T name){
//        return null;
//    }

}

