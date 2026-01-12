
package io;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class ReadByteTest2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\ahamm\\test.txt");
            int i;
            while ((i = fin.read()) != -1) {                
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
