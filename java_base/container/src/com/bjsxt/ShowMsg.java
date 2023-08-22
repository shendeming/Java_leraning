package com.bjsxt;

public class ShowMsg {

//    public void showFlag(Generic<Integer> generic){
//            System.out.println(generic.getFlag());
//}

    /** 无界通配符? 解决当具体类型不确定的问题 */
    public void showFlag(Generic<?> generic){
        System.out.println(generic.getFlag());
    }

//    /** 通配符的上限限定 */
//    public void showFlag(Generic<? extends Number> generic){
//        System.out.println(generic.getFlag());
//    }

//    /** 通配符的下限限定 */
//    public void showFlag(Generic<? super Integer> generic){
//        System.out.println(generic.getFlag());
//    }
}
