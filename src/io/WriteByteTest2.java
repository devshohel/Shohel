
package io;

import java.io.FileOutputStream;


public class WriteByteTest2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\ahamm\\test.txt");
            String s2 = "No pain, no gain.";
            byte b[] = s2.getBytes();
            fout.write(b);
        } catch (Exception e) {
        }
    }
}
