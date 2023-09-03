import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo8 {
    public static void main(String[] args) {
        /*
            需求：
                创建集合添加学生对象
                学生对象属性：name,age
            要求：
                获取姓名并放到数组当中
                使用方法引用完成
         */

        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.添加元素
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        //3.获取姓名并放到数组当中
        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));

        System.out.println("----------方法引用--------------");
        //对象::方法名  形参，返回值
        //类名::方法名   被引用的方法形参是跟抽象方法的第二个参数后面的保持一致
        String[] arr2 = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
