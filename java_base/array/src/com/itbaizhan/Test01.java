package com.itbaizhan;

// 数组的声明和创建
public class Test01 {
    public static void main(String[] args) {
        /* 基本类型一维数组 */
        int[] s;                       // 声明
        s = new int[10];               // 创建

        for (int i=0; i<10; i++){
            s[i] = 2*i+1;
            System.out.println(s[i]);
        }

        /* 引用类型一维数组 */
        Man[] mans;
        mans = new Man[10];

        Man m1 = new Man(1,11);
        Man m2 = new Man(2,22);

        // 动态初始化
        mans[0] = m1;
        mans[1] = m2;

        System.out.println(mans[0].getId());
        System.out.println(mans[0].getAge());
    }
}


class Man{
    private int age;
    private int id;
    public Man(int id,int age) {
        super();
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}