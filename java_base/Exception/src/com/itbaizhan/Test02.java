package com.itbaizhan;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试CheckException（已检查异常，编译器报错）
 */
public class Test02 {
    public static void main(String[] args) {
//        File file = new File("e:/IDEA-projects/java_test/Exception/a.txt");
//        file.createNewFile()

        FileReader reader = null;
        try {
            reader = new FileReader("e:/IDEA-projects/java_test/Exception/a.txt");
            char c = (char)reader.read();
            char c2 = (char)reader.read();
            char c3 = (char)reader.read();
            System.out.println(""+c+c2+c3);
        } catch (FileNotFoundException e) {  // 子类异常在父类异常前面
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Test02.main");
            try {
                if (reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
