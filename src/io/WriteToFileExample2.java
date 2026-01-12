
package io;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteToFileExample2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ahamm\\test.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Hello world");
            bw.newLine();
            bw.write("I am Shohel.");
            bw.newLine();
            bw.write("I am going to a programmer.");
            bw.newLine();
            bw.write("Good, better, best.");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
