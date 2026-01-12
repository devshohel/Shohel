
package io;

import java.io.FileOutputStream;
import java.io.IOException;


public class WriteByteTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\ahamm\\test.txt");
            String s = "Where there is a will, there is a way.";
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("Byte write succesfull");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
