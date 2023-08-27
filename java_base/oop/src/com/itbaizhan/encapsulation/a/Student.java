package com.itbaizhan.encapsulation.a;

public class Student {
    public void study(){
        Person p = new Person();
//        System.out.println(p.testPrivate);
        System.out.println(p.testDefault);
        System.out.println(p.testProtected);
        System.out.println(p.testPublic);
    }
}
