
package io;

import java.io.FileInputStream;


public class ReadByteTest {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\ahamm\\test.txt");
            int i;
            while ((i = fin.read()) != -1) {                
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
