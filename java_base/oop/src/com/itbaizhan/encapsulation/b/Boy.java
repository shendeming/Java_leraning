package com.itbaizhan.encapsulation.b;

import com.itbaizhan.encapsulation.a.Person;

public class Boy extends Person {
    public void play(){
        System.out.println(super.testProtected);
        System.out.println(super.testPublic);

        /**
         * 若子类和父类不在同一个包中，子类可访问父类的 protected 成员，
         * 不能访问父类对象的 protected 成员
         */
        Person p = new Person();
        // System.out.println(p.testProtected);
    }
}
