// 测试字符串

public class Teststring {
    public static void main(String[] args) {
        String s0 = null;
        String s1 = "";  //空字符串
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String();

//        System.out.println(s0.length());  // 会报空指针异常
        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println("=======字符串相等========");
        String g1 = "北京尚学堂";
        String g2 = "北京尚学堂";
        String g3 = new String("北京尚学堂");
        System.out.println(g1 == g2); // true
        System.out.println(g1 == g3); // false
        System.out.println(g1.equals(g3)); //true

    }
}
