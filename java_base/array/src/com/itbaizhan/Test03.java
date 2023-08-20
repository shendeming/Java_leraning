package com.itbaizhan;

public class Test03 {
    public static void main(String[] args) {
        String[] cities = {"北京","上海","广州","深圳"};

        // 使用循环遍历数组
        for(int i=0; i<cities.length; i++){
            System.out.println(cities[i]);
        }

        // 使用增强for循环遍历数组
        for (String t:cities){
            System.out.println(t);
        }

    }
}
