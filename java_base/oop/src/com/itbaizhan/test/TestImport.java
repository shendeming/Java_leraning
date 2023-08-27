package com.itbaizhan.test;

import com.itbaizhan.oop.Car;
import static java.lang.Math.*;        //导入Math类的所有静态属性
import static java.lang.Math.PI;       //导入Math类的PI属性
/**
 * 测试导入import
 */
public class TestImport {
    public static void main(String[] args) {
//        com.itbaizhan.oop.Car car = new com.itbaizhan.oop.Car();

        Car c1 = new Car();
        Car c2 = new Car();

//        String str;
//        java.lang.String str2;

        System.out.println(PI);
        System.out.println(random());
    }
}
