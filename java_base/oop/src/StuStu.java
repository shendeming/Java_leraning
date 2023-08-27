/**
 * 一个学生类
 */
public class StuStu {
    //属性（成员方法）
    int id;
    int age;
    String sname;

    //方法
    public void study(){
        System.out.println("正在学习，勿扰！");
    }
    public void kickball(){
        System.out.println("踢球中！");
    }

    public static void main(String[] args) {
        StuStu s1 = new StuStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "沈德明";
        System.out.println(s1.id);
        System.out.println(s1.sname);

        s1.study();
        s1.kickball();
    }

}
