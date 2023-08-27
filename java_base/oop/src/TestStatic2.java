public class TestStatic2 {
    static String company; //公司名称

    // 静态初始化块，用于类的初始化操作，初始化静态属性。
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[ ] args) {

    }
}
