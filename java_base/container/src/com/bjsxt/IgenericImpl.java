package com.bjsxt;

// 泛型接口的具体类型需要在实现类中进行声明
public class IgenericImpl implements Igeneric<String>{
    @Override
    public String getName(String name) {
        return name;
    }
}
