
package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\ahamm\\test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Very good");
            bw.newLine();
            bw.write("Almost super.");
            bw.close();
            System.out.println("new line write");
        } catch (IOException e) {
            System.out.println("write fail");
        }
    }
}
