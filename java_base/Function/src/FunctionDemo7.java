import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo7 {
    public static void main(String[] args) {
        /*
        需求：
                集合存储一些字符串中的数据，比如：张三,23
                收集到Student类型的数组中
         */
        //1.创建集合对象，添加数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15","周芷若,14","赵敏,13","张强,20","张三丰,100","张翠山,40","张良,35","王二麻子,37");

        //2.先把字符串变成Student对象，然后再把Student对象收集起来
        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
