package com.itbaizhan.oop;

/**
 * 测试方法重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        Plane p = new Plane();
        h.run();
        h.getVehicle();
        p.run();
    }
}

class Vehicle{            // 交通工具类
    public void run(){
        System.out.println("跑跑.....");
    }

    public Vehicle getVehicle(){
        System.out.println("给你一个交通工具！");
        return null;
    }
}

class Horse extends Vehicle{
    @Override //方法重写
    public void run() {
        System.out.println("得得得");
    }

    @Override
//    public Vehicle getVehicle() {    // 方法重写时，返回值类型，子类小于等于父类
    public Horse getVehicle() {
        return new Horse();
    }
}

class Plane extends Vehicle{
    @Override
    public void run() {
        System.out.println("天上飞....");
    }
}

