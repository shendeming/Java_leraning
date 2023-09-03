import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        /**
         * 案例需求
         * 现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
         * - 男演员只要名字为3个字的前2人
         * - 女演员只要姓杨的，并且不要第一个
         * - 把过滤后的男演员姓名和女演员姓名合并到一起
         * - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
         * - 把所有演员对象都保存到List集合中
         *
         * 演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
         */

        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        Collections.addAll(manList, "蔡坤坤,24","叶齁咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");


        ArrayList<String> womanList = new ArrayList<String>();
        Collections.addAll(womanList, "赵小颖,35","杨颖,36","高元元,43","张天填,31","刘诗,35","杨小蜜,33");

        //男演员只要名字为3个字的前三人
        Stream<String> manStream = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);


        //女演员只要姓林的，并且不要第一个
        Stream<String> womanStream = womanList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

        //把过滤后的男演员姓名和女演员姓名合并到一起

        //演员封装成Actor对象
        //String -> Actor对象 (类型转换)
/*        Stream.concat(manStream, womanStream).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                //"赵小颖,35"
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name,age);
            }
        }).forEach(s -> System.out.println(s));*/

        System.out.println("-------------------------------");
        List<Actor> list = Stream.concat(manStream, womanStream)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);


    }
}
