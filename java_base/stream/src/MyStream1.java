import java.util.ArrayList;

public class MyStream1 {
    public static void main(String[] args) {
        /*
            创建一个集合，存储多个字符串元素：
            1.把集合中所有以"张"开头的元素存储到一个新的集合
            2.把"张"开头的集合中的长度为3的元素存储到一个新的集合
            3.遍历上一步得到的集合
        */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        list1.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s-> System.out.println(s));

/*        //1.遍历list1把以张开头的元素添加到list2中。
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }

        //2.遍历list2集合，把其中长度为3的元素，再添加到list3中。
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length() == 3){
                list3.add(s);
            }
        }

        //3.遍历打印最终结果
        for (String s : list3) {
            System.out.println(s);
        }*/
    }
}
