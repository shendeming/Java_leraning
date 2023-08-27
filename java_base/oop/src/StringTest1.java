public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "core Java";
        String s2 = "Core Java";
        System.out.println(s1.charAt(3)); // 提取下标为3的字符
        System.out.println(s2.length()); //字符串的长度
        System.out.println(s1.equals(s2)); //比较2个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2)); //比较两个字符串（忽略大小写）
        System.out.println(s1.indexOf("Java")); // 字符串 s1 中是否包含 Java
        System.out.println(s1.indexOf("apple")); // 字符串 s1 中是否包含 apple

        String s3 = "I love java。java is best language!";
        System.out.println(s3.indexOf("java"));
        System.out.println(s3.lastIndexOf("java"));

        // 返回的是全新的字符串
        String s = s1.replace(' ','&'); //将s1中的空格替换成&
        System.out.println("result is:"+s);
    }
}
