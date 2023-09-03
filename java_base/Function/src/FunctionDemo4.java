import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        /*
            方法引用（引用构造方法）
            格式
                类名::new

            目的：
                创建这个类的对象

            需求：
                集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中

                //方法引用
                //1.引用处需要是函数式接口
                //2.被引用的方法需要已经存在
                //3.被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
                //4.被引用方法的功能需要满足当前的要求
         */

        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "张无忌,15","周芷若,14","赵敏,13","张强,20","张三丰,100","张翠山,40","张良,35","王二麻子,37");
        //3.封装成Student对象并收集到List集合中
        //String -> Student
        List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split(",");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());

        System.out.println(newList);

        System.out.println("----------引用构造方法--------------");
        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);


    }
}
