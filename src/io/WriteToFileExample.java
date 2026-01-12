
package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ahamm\\test.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Hello World.");
            
            bw.newLine();
            
            bw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
