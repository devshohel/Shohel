
package io;

import java.io.FileInputStream;


public class FourInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\SHOHEL\\Desktop\\test.txt");
            int j ;
            while ((j = fin.read()) != -1) {                
                System.out.println((char)j);
            }
            System.out.println(fin.read());
        } catch (Exception e) {
        }
    }
}
