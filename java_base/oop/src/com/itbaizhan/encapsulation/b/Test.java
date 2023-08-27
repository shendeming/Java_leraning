package com.itbaizhan.encapsulation.b;

public class Test {
    public static void main(String[] args) {
        User u = new User();
        u.setId(100);
        u.setName("沈德明");
        u.setMan(true);

        System.out.println(u.getName());
        System.out.println(u.getId());
        System.out.println(u.isMan());
    }
}
