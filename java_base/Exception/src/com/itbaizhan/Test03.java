package com.itbaizhan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
测试throws声明式异常
 */
public class Test03 {
    public static void main(String[] args) throws IOException {

        FileReader reader = null;
        try {
            reader = new FileReader("e:/IDEA-projects/java_test/Exception/a.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            char c3 = (char) reader.read();
            System.out.println("" + c + c2 + c3);
        } finally {
            System.out.println("Test02.main");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
