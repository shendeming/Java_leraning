package com.bjsxt;

public class Test6 {
    public static void main(String[] args) {
        ShowMsg showMsg = new ShowMsg();
        Generic<Integer> generic = new Generic<>();

        generic.setFlag(20);
        showMsg.showFlag(generic);

        /** 泛型不考虑继承关系 */
//        Generic<Number> generic1 = new Generic<>();
//        showMsg.showFlag(generic1);

        Generic<Number> generic1 = new Generic<>();
        generic1.setFlag(50);
        showMsg.showFlag(generic1);

        Generic<String> generic2 = new Generic<>();
        generic2.setFlag("shen");
        showMsg.showFlag(generic2);
    }
}
