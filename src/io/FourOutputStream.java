
package io;

import java.io.FileOutputStream;
import java.io.IOException;


public class FourOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\SHOHEL\\Desktop\\test.txt", true);
            String s = "\nThere is 50 million people lives.";
            byte []b = s.getBytes();
            fout.write(b);
            
        } catch (Exception e) {
        }
    }
}
