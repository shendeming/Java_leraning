package com.itbaizhan.testinterface;

/**
 * 测试接口
 *  访问修饰符： 只能是 public 或默认。
 *  接口名： 和类名采用相同命名机制。
 *  extends 接口可以多继承。
 *  常量： 接口中的属性只能是常量，总是： public static final 修饰。不写也是。
 *  方法： 接口中的方法只能是： public abstract 。省略的话，也是 public abstract 。
 */

// 飞行接口
public interface Volant {  // 访问修饰符是 public 或默认。
    // 常量： 接口中的属性只能是常量，总是： public static final 修饰。不写也是。
    /* public static final */ int Fly_HIGHT = 100;
    // 方法： 接口中的方法只能是： public abstract 。省略的话，也是 public abstract 。
    /* public abstract */ void fly();
}

// 善良接口
interface Honest{        // 访问修饰符是 public 或默认。
    void helpOther();
}

class GoodMan implements Honest {

    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路！");
    }
}

class BirdMan implements Volant {

    @Override
    public void fly() {
        System.out.println("我在飞！");
    }
}

// 接口Volant和实现类Angel不是父子关系，是实现规则的关系
class Angel implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("Angel.fly");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther");
    }
}

class Plane implements Volant{

    @Override
    public void fly() {
        System.out.println("飞机，在飞！");
    }
}