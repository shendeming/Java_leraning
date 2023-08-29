import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo7 {
    public static void main(String[] args) {

        /**
        void forEach(Consumer action)     遍历
        long count()                      统计
        toArray()                         收集流中的数据，放到数组中
        */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王麻子-37");

        //toArray()
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));


        System.out.println("------------------------------------------------------");
        //IntFunction的泛型：具体类型的数组
        //apply的形参：流中数据的个数，要跟数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组

        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        //toArray方法的返回值：是一个装着流里面所有数据的数组
        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(array));

        System.out.println("---------------lambda表达式形式--------------");
        String[] array1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array1));


    }
}
