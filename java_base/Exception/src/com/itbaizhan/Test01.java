package com.itbaizhan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试运行时异常和处理方式(RuntimeException)
 */
public class Test01 {
    public static void main(String[] args) {
//        System.out.println("111");
//
//        try{
//            int a = 1/0;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        System.out.println("222");

        // 解决ArithmeticException 异常：试图除以 0
        int b=0;
        if(b!=0){
            System.out.println(1/b);
        }

        // 解决NullPointerException 异常
        String str=null;
        if (str != null) {
            System.out.println(str.charAt(0));
        }

        // 解决ClassCastException 异常
        Animal a = new Cat();
//        Dog d = (Dog)a;
        if (a instanceof Dog){
            Dog d = (Dog)a;
        }

        // 解决ArrayIndexOutOfBoundsException 异常
//        int[] arr = new int[5];  // 下标范围：[0,4]
//        System.out.println(arr[5]);
        int[] arr = new int[5];
        int index = 5;
        if (index < arr.length){
            System.out.println(arr[index]);
        }

        // 解决NumberFormatException 异常
//        String str1 = "1234abcf";
//        System.out.println(Integer.parseInt(str1));
        String str1 = "1234abcf";
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(str1);
        if (m.matches()){ // 如果str1匹配代表数字的正则表达式，才会转换
            System.out.println(Integer.parseInt(str1));
        }



    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
